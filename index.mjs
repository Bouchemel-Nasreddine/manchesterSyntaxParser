import express from 'express';
import path from 'path';
import { fileURLToPath } from 'url';


import antlr4, { ParseTreeVisitor, ParseTreeWalker } from 'antlr4';


import OWL2ManchesterParser from './parser/OWL2ManchesterParser.js';
import OWL2ManchesterLexer from './parser/OWL2ManchesterLexer.js';
import OWL2ManchesterListener from './parser/OWL2ManchesterListener.js';


const app = express();
const port = 3000;

const __filename = fileURLToPath(import.meta.url);

const __dirname = path.dirname(__filename);


//allow all cors
app.use((req, res, next) => {
  res.header("Access-Control-Allow-Origin", "*");
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});


app.use(express.urlencoded({ extended: true }));

app.use(express.static('views'));

app.use(express.static(path.join(__dirname, "js")));



app.use("/parse", (req, res) => {


  const { owlInput } = req.body

  // Replace spaces within single-quoted strings with underscores and remove quotes
  const modifiedInput = owlInput.replace(/'([^']+?)'/g, (match, p1) => {
    // Remove spaces and replace them with underscores
    const modifiedName = p1.replace(/\s+/g, "_");
    return modifiedName;
  });

  // Create an ANTLR input stream
  const inputStream = new antlr4.InputStream(modifiedInput);

  // Create a lexer
  const lexer = new OWL2ManchesterLexer(inputStream);

  // Create a token stream
  const tokenStream = new antlr4.CommonTokenStream(lexer);

  // Create a parser
  const parser = new OWL2ManchesterParser(tokenStream);

  const completionListener = new MyCompletionListener();
  parser.addParseListener(completionListener);

  parser.removeErrorListeners();
  const errorListener = new MyErrorListener();
  parser.addErrorListener(new MyErrorListener());

  const parseTree = parser.axiom();
  //get the root element of the tree
  console.log(parseTree.children[0].getText());

  const walker = new ParseTreeWalker();

  //walker.walk(completionListener, parseTree);

  const treePrinter = new TreePrinterVisitor();
  const treeOutput = treePrinter.visit(parseTree);
  console.log(treeOutput);


  // Now, you can traverse the parse tree and process the information

  //console.log("parseTree: ", parseTree.children[0]);
  const currentContext = completionListener.getCurrentContext();
  if (parser._syntaxErrors > 0) {
    //console.error("Number of syntax errors: ", parser._syntaxErrors);
    return res.status(200).send("syntax not valid")
  } else {
    //console.log("parsing successful");
    return res.send("parsing successful")
  }

})

// ... (previous server-side code)

app.use("/getSuggestions", (req, res) => {
  const owlInput = req.body.owlInput;

  const inputStream = new antlr4.InputStream(owlInput);
  const lexer = new OWL2ManchesterLexer(inputStream);
  const tokenStream = new antlr4.CommonTokenStream(lexer);
  const parser = new OWL2ManchesterParser(tokenStream);

  const completionListener = new MyCompletionListener();
  parser.addParseListener(completionListener);

  parser.removeErrorListeners();
  const errorListener = new MyErrorListener();
  parser.addErrorListener(new MyErrorListener());

  const parseTree = parser.axiom();
  const currentContext = completionListener.getCurrentContext();
  const suggestions = completionListener.getSuggestions();

  res.json({ currentContext, suggestions });
});





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


app.listen(port, () => {
  console.log(`Server listening at http://localhost:${port}`);
});
