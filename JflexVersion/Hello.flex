import java.util.*;
import java.util.Stack;

%%
 
%class HelloLexer
%line
%int
%{
    VarNode currAssig;

    Stack<Node> stack = new Stack<>();
    
    Stack<VarNode> variables = new Stack<>();

    void sequenceMaker(Node last) {
        Stack<Node> temp_stack = new Stack<>();
        temp_stack.push(last);
        while (stack.empty() == false  && !(stack.peek() instanceof SymbolNode)) {
            temp_stack.push(stack.pop());
        }
        Node ret = temp_stack.pop();
        while (!temp_stack.empty()) {
            Node aux = temp_stack.pop();
            ret = new SequenceNode(aux, ret);
        }
        stack.push(ret);
    }

    Node exprSimplify() {
        Stack<Node> temp_stack = new Stack<>();

        String sym = "";
        while (!sym.equals("(") && !sym.equals("=")) {
            Node value = stack.pop();
            SymbolNode symbol = ((SymbolNode) stack.pop());
            sym = symbol.getSymbol();
            
            if (sym.equals("(") || sym.equals("=")) {
                temp_stack.push(value);
                break;
            }
            switch (sym) {
                case "/":
                    Node valueN = stack.pop();
                    DivNode dNode = new DivNode(valueN, value);
                    symbol = ((SymbolNode) stack.pop());
                    sym = symbol.getSymbol();
                    while (sym.equals("/")) {
                        DivNode aux = dNode;
                        valueN = stack.pop();
                        dNode = new DivNode(valueN, aux);
                        symbol = ((SymbolNode) stack.pop());
                        sym = symbol.getSymbol();
                    }
                    temp_stack.push(dNode);
                    if (!sym.equals("(") 
                        && !sym.equals("=")) {
                        temp_stack.push(symbol);
                    }
                    break;

                case "!":
                    NotNode nNode = new NotNode(value);
                    symbol = ((SymbolNode) stack.pop());
                    sym = symbol.getSymbol();
                    while (sym.equals("!"))  {
                        NotNode aux = nNode;
                        nNode = new NotNode(aux);
                        symbol = ((SymbolNode) stack.pop());
                        sym = symbol.getSymbol();
                    }
                    temp_stack.push(nNode);
                    if (!sym.equals("(") 
                        && !sym.equals("=")) {
                        temp_stack.push(symbol);
                    }
                    break;
                case "(":
                    break;
                case "=":
                    break;
                default:
                    temp_stack.push(value);
                    temp_stack.push(symbol);
                    break;
            }
        }

        Stack<Node> temp_stack2 = new Stack<>();
        
        Node last = temp_stack.pop();
        if (temp_stack.empty()) {
            return last;
        }
        while (!temp_stack.empty()) {
            Node aux = temp_stack.pop(); 
            sym = ((SymbolNode) aux).getSymbol();
            switch (sym) {
                case "+":
                    last = new PlusNode(last, temp_stack.pop());
                    if (temp_stack.empty())
                        temp_stack2.push(last);
                    break;
                default:
                    temp_stack2.push(last);
                    temp_stack2.push(aux);
                    last = temp_stack.pop();
                    if (temp_stack.empty())
                        temp_stack2.push(last);
                    break;
            }
        }

        while (!temp_stack2.empty()) {
            temp_stack.push(temp_stack2.pop());
        }
        
        last = temp_stack.pop();
        if (temp_stack.empty()) {
            return last;
        }
        while (!temp_stack.empty()) {
            Node aux = temp_stack.pop(); 
            sym = ((SymbolNode) aux).getSymbol();
            switch (sym) {
                case ">":
                    last = new GreaterNode(last, temp_stack.pop());
                    if (temp_stack.empty())
                        temp_stack2.push(last);
                    break;
                default:
                    temp_stack2.push(last);
                    temp_stack2.push(aux);
                    last = temp_stack.pop();
                    if (temp_stack.empty())
                        temp_stack2.push(last);
                    break;
            }
        }
        while (!temp_stack2.empty()) {
            temp_stack.push(temp_stack2.pop());
        }

        last = temp_stack.pop();
        while (!temp_stack.empty()) {
            Node aux = temp_stack.pop(); 
            sym = ((SymbolNode) aux).getSymbol();
            switch (sym) {
                case "&&":
                    last = new AndNode(last, temp_stack.pop());
                    break;
                default:
                    break;
            }
        }

        return last;
    }

    Node getContentBlock() {
        Node last = null;
        Node x = stack.pop();
        while (!(x instanceof SymbolNode)) {
            if (last == null) {
                last = x;
            } else {
                last = new SequenceNode(x, last);
            }
            x = stack.pop();
        }
        return last;
    }

%}

number = [1-9][0-9]* | 0
string = [a-z]+
var = {string}
bval = "true" | "false"

and = "&&"
plus = "+"
div = "/"
greater = ">"
not = "!"
open_par = "("
close_par = ")"

symbol = {and} | {plus} | {div} | {greater} | {not}

%state INIT
%state MAIN
%state ASSIG
%state CONDITIONIF
%state BODYIF
%state ELSE
%state CONDITIONWHILE
%state BODYWHILE

%%   
<YYINITIAL> {
    "int" { yybegin(INIT);}
}
<INIT> {
    {var} { variables.push(new VarNode(yytext())); }
    ";" { yybegin(MAIN); }
}

<MAIN> {
    "if" { stack.push(new SymbolNode("main")); yybegin(CONDITIONIF); }

    "while" { stack.push(new SymbolNode("main")); yybegin(CONDITIONWHILE); }

    {var} {
        currAssig = new VarNode(yytext());
        stack.push(new SymbolNode("main"));
        yybegin(ASSIG);
    }
}

<ASSIG> {
    {number} { stack.push(new IntNode(yytext())); }
    {var}     { stack.push(new VarNode(yytext())); }

    {symbol} | "=" | "(" { stack.push(new SymbolNode(yytext())); }

    {close_par}     {
        Node x =  exprSimplify();
        stack.push(new BracketNode(x));
    }
   ";" {
        Node x = exprSimplify();
        SymbolNode back = ((SymbolNode)stack.pop());
        stack.push(new AssignmentNode(currAssig, x));
        switch (back.getSymbol()) {
            case "main":
                yybegin(MAIN);
                break;
            case "bodyif":
                yybegin(BODYIF);
                break;
            case "else":
                yybegin(ELSE);
                break;
            case "bodywhile":
                yybegin(BODYWHILE);
                break;
            default:
                break;
        }
    }

}

<CONDITIONIF> {
    {number} { stack.push(new IntNode(yytext())); }
    {bval}  { stack.push(new BoolNode(yytext())); }
    {var}   { stack.push(new VarNode(yytext())); }
    {symbol} | "=" | "(" { stack.push(new SymbolNode(yytext())); }
    {close_par}     {
        Node x =  exprSimplify();
        stack.push(new BracketNode(x));
    }
    "{" { stack.push(new SymbolNode("{")); yybegin(BODYIF); }
}

<BODYIF> {
    "if" { stack.push(new SymbolNode("bodyif")); yybegin(CONDITIONIF); }

    "while" { stack.push(new SymbolNode("bodyif")); yybegin(CONDITIONWHILE); }

    "}" {
        stack.push(new BlockNode(getContentBlock()));
    }

    "else" { yybegin(ELSE); }

    {var} {
        currAssig = new VarNode(yytext());
        stack.push(new SymbolNode("bodyif"));
        yybegin(ASSIG);
    }
}

<ELSE> {
    "if" { stack.push(new SymbolNode("else")); yybegin(CONDITIONIF); }

    "while" { stack.push(new SymbolNode("else")); yybegin(CONDITIONWHILE); }
    
    "{" { stack.push(new SymbolNode("{")); }

    "}" { 
        Node elseNode = new BlockNode(getContentBlock());
        Node bodyNode = stack.pop();
        Node conditionNode = stack.pop();
        SymbolNode back = ((SymbolNode)stack.pop());
        stack.push(new IfNode(conditionNode, bodyNode, elseNode));
        switch (back.getSymbol()) {
            case "main":
                yybegin(MAIN);
                break;
            case "bodyif":
                yybegin(BODYIF);
                break;
            case "else":
                yybegin(ELSE);
                break;
            case "bodywhile":
                yybegin(BODYWHILE);
                break;
            default:
                break;
        }
    }

    {var} {
        currAssig = new VarNode(yytext());
        stack.push(new SymbolNode("else"));
        yybegin(ASSIG);
    }
}

<CONDITIONWHILE> {

    
    {number} { stack.push(new IntNode(yytext())); }
    {bval}  { stack.push(new BoolNode(yytext())); }
    {var}   { stack.push(new VarNode(yytext())); }
    {symbol} | "=" | "(" { stack.push(new SymbolNode(yytext())); }
    {close_par}     {
        Node x =  exprSimplify();
        stack.push(new BracketNode(x));
    }
    "{" { stack.push(new SymbolNode("{")); yybegin(BODYWHILE); }
}

<BODYWHILE> {
    "if" { stack.push(new SymbolNode("bodywhile")); yybegin(CONDITIONIF); }

    "while" {stack.push(new SymbolNode("bodywhile")); yybegin(CONDITIONWHILE); }
    
    "{" { stack.push(new SymbolNode("{")); }

    "}" {
        Node bodyNode = new BlockNode(getContentBlock());
        Node conditionNode = stack.pop();
        SymbolNode back = ((SymbolNode)stack.pop());
        stack.push(new WhileNode(conditionNode, bodyNode));
        switch (back.getSymbol()) {
            case "main":
                yybegin(MAIN);
                break;
            case "bodyif":
                yybegin(BODYIF);
                break;
            case "else":
                yybegin(ELSE);
                break;
            case "bodywhile":
                yybegin(BODYWHILE);
                break;
            default:
                break;
        }
    }

    {var} {
        currAssig = new VarNode(yytext());
        stack.push(new SymbolNode("bodywhile"));
        yybegin(ASSIG);
    }
}

[^}] {}
. {}