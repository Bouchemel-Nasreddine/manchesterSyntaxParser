import { printTree } from './ParserHandler.js';


$(document).ready(function() {
    const owlInput = $('#owlInput');
    const suggestionsDiv = $('#suggestions');
    const submitButton = $('#submitButton');
    const resultDiv = $('#result');

    owlInput.on('input', function() {
        console.log("input changed");
      const currentText = owlInput.val();
      getSuggestions(currentText);
    });

    submitButton.on('click', function(event) {
      event.preventDefault();
      console.log("submutting syntax")

      const currentText = owlInput.val();
      //send http request to server http://localhost:3000/parse
      $.ajax({
        url: 'http://localhost:3000/parse',
        method: 'POST',
        data: { owlInput: currentText },
        success: function(response) {
          console.log('Response:', response);
          resultDiv.html(response);
        },
        error: function(err) {
          console.error('Error parsing input:', err);
          resultDiv.html(err);
        }
      });
      //invoke printTree method from sibling file ParserHanlder.js
      printTree(currentText, 0);
    });
  
    function getSuggestions(input) {
      $.ajax({
        url: 'http://localhost:3000/getSuggestions',
        method: 'POST',
        data: { owlInput: input },
        success: function(response) {
          const currentContext = response.currentContext;
          const suggestions = response.suggestions;
  
          console.clear();
          console.log('Current Context:', currentContext);
          console.log('Suggestions:', suggestions);
  
          suggestionsDiv.html('Suggestions: ' + suggestions.join(', '));
        },
        error: function(err) {
          console.error('Error getting suggestions:', err);
        }
      });
    }
  });