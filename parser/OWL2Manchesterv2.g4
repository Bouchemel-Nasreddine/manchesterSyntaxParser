grammar OWL2Manchester;

// Lexer rules
fragment DIGIT : [0-9];
NONNEGATIVEINTEGER : DIGIT+;

CLASS_IRI : [a-zA-Z]+; // Assuming class IRI is composed of letters only for simplicity
OBJECT_PROPERTY_IRI : [a-zA-Z]+; // Assuming object property IRI is composed of letters only
DATA_PROPERTY_IRI : [a-zA-Z]+; // Assuming data property IRI is composed of letters only
INDIVIDUAL : [a-zA-Z]+; // Assuming individual is composed of letters only
Datatype : [a-zA-Z]+; // Define Datatype according to your specifications
STRING_LITERAL : '"' (~["])* '"'; // Define STRING_LITERAL according to your specifications

// Parser rules
literalList : literal (',' literal)*;

description : conjunction ('or' conjunction)*;

conjunction : CLASS_IRI 'that' ('not'?) restriction ('and' ('not'?) restriction)*
            | primary ('and' primary)*;

primary : ('not'?) (restriction | atomic);

restriction : objectPropertyExpression 'some' primary
            | objectPropertyExpression 'only' primary
            | objectPropertyExpression 'value' INDIVIDUAL
            | objectPropertyExpression 'Self'
            | objectPropertyExpression 'min' NONNEGATIVEINTEGER (primary)?
            | objectPropertyExpression 'max' NONNEGATIVEINTEGER (primary)?
            | objectPropertyExpression 'exactly' NONNEGATIVEINTEGER (primary)?
            | dataPropertyExpression 'some' dataPrimary
            | dataPropertyExpression 'only' dataPrimary
            | dataPropertyExpression 'value' literal
            | dataPropertyExpression 'min' NONNEGATIVEINTEGER (dataPrimary)?
            | dataPropertyExpression 'max' NONNEGATIVEINTEGER (dataPrimary)?
            | dataPropertyExpression 'exactly' NONNEGATIVEINTEGER (dataPrimary)?;

atomic : CLASS_IRI
       | '{' INDIVIDUAL (',' INDIVIDUAL)* '}'  
       | '(' description ')';

literal : STRING_LITERAL; // Define STRING_LITERAL according to your specifications

dataPrimary : ('not'?) dataAtomic;

dataAtomic : Datatype
           | '{' literalList '}'
           | datatypeRestriction
           | '(' dataRange ')';

datatypeRestriction : Datatype '[' facet restrictionValue (',' facet restrictionValue)* ']';

facet : 'length' | 'minLength' | 'maxLength' | 'pattern' | 'langRange' | '<=' | '<' | '>=' | '>';

restrictionValue : literal;

dataRange : dataConjunction ('or' dataConjunction)*;

dataConjunction : dataPrimary ('and' dataPrimary)*;

objectPropertyExpression : OBJECT_PROPERTY_IRI | inverseObjectProperty;

inverseObjectProperty : 'inverse' OBJECT_PROPERTY_IRI;

dataPropertyExpression : DATA_PROPERTY_IRI;

// Other lexer rules and parser rules can be added as necessary.
