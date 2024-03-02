
import antlr4 from './antlr4/index.web.js';


import OWL2ManchesterParser from '../parser/OWL2ManchesterParser.js';
import OWL2ManchesterLexer from '../parser/OWL2ManchesterLexer.js';


const ParserInput = (input) => {

  // Create an ANTLR input stream
  const inputStream = new antlr4.InputStream(input);

  const modifiedInput = owlInput.replace(/'([^']+?)'/g, (match, p1) => {
    // Remove spaces and replace them with underscores
    const modifiedName = p1.replace(/\s+/g, "_");
    return modifiedName;
  });

  // Create a lexer
  const lexer = new OWL2ManchesterLexer(modifiedInput);

  // Create a token stream
  const tokenStream = new antlr4.CommonTokenStream(lexer);

  // Create a parser
  const parser = new OWL2ManchesterParser(tokenStream);

  parser.removeErrorListeners();
  const errorListener = new MyErrorListener();
  parser.addErrorListener(new MyErrorListener());

    // Start parsing from the top-level rule
    const parseTree = parser.axiom();

    // Now, you can traverse the parse tree and process the information

    console.log("parseTree: ", parseTree);
    if (parser._syntaxErrors > 0) {
        console.error("Number of syntax errors: ", parser._syntaxErrors);
        console.error("Error messages: ", errorListener.getErrorMessages());
        return null;
    } else {
        console.log("parsing successful");
        return parseTree;
    }
}

const printTree = (parseTree, depth) => {
    let result = "";
    for (let i = 0; i < parseTree.children.length; i++) {
      const child = parseTree.children[i];
      result += "  ".repeat(depth) + child.getText() + "\n";
      result += printTree(child, depth + 1);
    }
    return result;
  }



class MyErrorListener extends antlr4.error.ErrorListener {
    constructor() {
      super();
      this.errorMessages = [];
    }
  
    syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
      //console.error(`Syntax Error at line ${line}:${column}: ${msg}`);
      this.errorMessages.push(`Error at line ${line}:${column}: ${msg}`);
    }
  
    getErrorMessages() {
      return this.errorMessages;
    }
  }
  
  class MyCompletionListener extends OWL2ManchesterListener {
    constructor() {
      super();
      this.currentContext = [];
      this.suggestions = [];
    }
  
    enterClassExpression(ctx) {
      // Example: Keep track of the current context for class expressions
      //console.log("enterClassExpression: ", ctx);
      this.currentContext.push("ClassExpression");    
      const isNestedExpression = this.currentContext.includes("ClassExpression");
      //console.log("currentContext: ", this.currentContext);
      // Clear previous suggestions
      this.suggestions = [];
  
      // Example: Suggest connectors when entering a class expression
      // if (this.isTopLevelClassExpression()) {
      //   this.suggestions = ["SomeClass1", "SomeClass2", "SomeClass3"];} else {
      //   this.suggestions = ["and", "or", "not"];
      // }
      if (this.openingParenTyped || !isNestedExpression) {
        // If an opening parenthesis has been typed recently or it's a top-level expression, suggest class names
        this.suggestions = ["SomeClass1", "SomeClass2", "SomeClass3"];
      } else {
        // Provide default suggestions for nested expressions
        this.suggestions = ["and", "or", "not"];
      }
    
  
      // console.log("suggestions: ", this.suggestions);
    }
  
    exitClassExpression(ctx) {
      // Example: Remove the current context when exiting class expression
      //console.log("exitClassExpression: ", ctx);
      this.currentContext.pop();
    }
  
    // Add similar methods for other grammar rules as needed
  
    getCurrentContext() {
      return this.currentContext.join(" > ");
    }
  
    getSuggestions() {
      return this.suggestions;
    }
  
    isInClassExpression() {
      return this.currentContext.includes("ClassExpression");
    }
  
    isTopLevelClassExpression() {
      //see if context length is even then it is top level
      //console.log("currentContext.length: ", this.currentContext.length);
      return this.currentContext.length % 2 === 0;
    }
  
    enterEveryRule(ctx) {
      const text = ctx.getText();
      //console.log(text);
    }
  
    visitTerminal(node) {
      //console.log(node.getText());
    }
  
  }
  
  //write a funtiocn tht does 
  
  class TreePrinterVisitor extends ParseTreeVisitor {
    constructor() {
      super();
      this.depth = 0;
    }
  
    // Override the default behavior for visiting rules
    visit(ctx) {
      this.depth++;
      const result = ctx.accept(this);
      this.depth--;
      return result;
    }
  
    // Override the default behavior for visiting terminal nodes
    visitTerminal(node) {
      return "  ".repeat(this.depth) + node.getText() + "\n";
    }
  
    // Override the default behavior for visiting non-terminal nodes
    visitChildren(ctx) {
      let result = "";
      for (let child of ctx.children) {
        result += this.visit(child);
      }
      return result;
    }
  }
  
  

module.exports = {
    ParserInput,
    printTree
}