/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Bonus;

mainNode
 : parse;

parse
 : seqNode EOF
 | assigNode EOF
 | ifNode EOF
 | whileNode EOF
 ;



BOOL : 'true' | 'false';
VAR : ('a'..'z')+;
NUMBER : ('0'..'9')+;

bracketNode
    : '(' aexpr ')'
    | '(' bexpr ')'
    ;

divNode : <assoc=right> divNode '/' (bracketNode | divNode | VAR | NUMBER)
         |(bracketNode | VAR | NUMBER) '/' (bracketNode | VAR | NUMBER);
plusNode : <assoc=right> plusNode '+' (bracketNode | divNode | VAR | NUMBER)
         |(bracketNode | divNode | VAR | NUMBER)'+' (bracketNode | divNode | VAR | NUMBER);

notNode : '!' bexpr;
greaterNode : (NUMBER | VAR | bracketNode | plusNode | divNode) '>' aexpr;
andNode : <assoc=right> andNode '&&' (bracketNode | notNode | greaterNode | BOOL)
        | (bracketNode | notNode | greaterNode | BOOL) '&&' (bracketNode | notNode | greaterNode | BOOL);

aexpr
    : bracketNode
    | divNode
    | plusNode
    | NUMBER
    | VAR
    ;

bexpr
    : bracketNode
    | andNode
    | notNode
    | greaterNode
    | VAR
    | BOOL 
    ;

seqNode
    : (assigNode | ifNode | whileNode) (seqNode | assigNode | ifNode | whileNode)
    ;

blockNode 
    : '{' (assigNode | ifNode | whileNode | (seqNode)*) '}'
    ;

assigNode 
    : VAR '=' aexpr ';'
    ;

ifNode 
    : 'if' bexpr blockNode 'else' blockNode
    ;
whileNode
    : 'while' bexpr blockNode
    ;

WS
: [ \t\n\r] + -> skip
;
