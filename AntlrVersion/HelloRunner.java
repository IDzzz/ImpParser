import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class HelloRunner 
{       
    public static String addNewline(String print) {
		Scanner scanner = new Scanner(print);
		String build = "";
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			build += "\t" + line + "\n";
		}
		scanner.close();
		return build;
    }
        
	public static void main( String[] args) throws Exception 
	{
        BufferedReader br = new BufferedReader(new FileReader("input")); 
  
        String st;
        String rez = "";
        br.readLine(); 
        while ((st = br.readLine()) != null) {
                rez += st;
		}
        var input = CharStreams.fromString(rez);

        var lexer = new BonusLexer(input);
        var tokenStream = new CommonTokenStream(lexer);

        var parser = new BonusParser(tokenStream);
        var tree = parser.mainNode();
        
        var visitor = new BonusBaseVisitor<String>() {
        	@Override
                public String visitMainNode(BonusParser.MainNodeContext ctx) {
                        String build = "<MainNode>\n";
                        String rez = visitParse(ctx.parse());
                        build += addNewline(rez);
        		return build;
                }
        	@Override
                public String visitParse(BonusParser.ParseContext x) {
                        return visit(x.getChild(0));
                }
                
                @Override
                public String visitAexpr(BonusParser.AexprContext x) {
                        return visit(x.getChild(0));
                }
                @Override
                public String visitBexpr(BonusParser.BexprContext x) {
                        return visit(x.getChild(0));
                }
                @Override
                public String visitTerminal(TerminalNode x) {
        		String regex = "\\d+";                
                        String rez = x.getText();
                        String print;
                        if(rez.equals("true") || rez.equals("false"))
                                return "<BoolNode> " + rez;
                        if(rez.matches(regex)) {
                                return "<IntNode> " + rez;
                        } else {
                                return "<VariableNode> " + rez;
                        }
                }
                @Override
                public String visitAssigNode(BonusParser.AssigNodeContext x) {
                        String build = "<AssignmentNode> =\n";
                        String var = "<VariableNode> " + x.getChild(0);
                        String rez = visit(x.getChild(2));
                        build += addNewline(var);
                        build += addNewline(rez);
                        return build;
                }
                @Override
                public String visitBracketNode(BonusParser.BracketNodeContext x) {
                        String build = "<BracketNode> ()\n";
                        String rez = visit(x.getChild(1));
                        build += addNewline(rez);
                        return build;
                }
                @Override
                public String visitDivNode(BonusParser.DivNodeContext x) {
                        String build = "<DivNode> /\n";
                        String rez1 = visit(x.getChild(0));
                        String rez2 = visit(x.getChild(2));
                        build += addNewline(rez1);
                        build += addNewline(rez2);
                        return build;
                }
                @Override
                public String visitPlusNode(BonusParser.PlusNodeContext x) {
                        String build = "<PlusNode> +\n";
                        String rez1 = visit(x.getChild(0));
                        String rez2 = visit(x.getChild(2));
                        build += addNewline(rez1);
                        build += addNewline(rez2);
                        return build;
                }
                @Override
                public String visitNotNode(BonusParser.NotNodeContext x) {
                        String build = "<NotNode> !\n";
                        String rez = visit(x.getChild(1));
                        build += addNewline(rez);
                        return build;
                }
                @Override
                public String visitGreaterNode(BonusParser.GreaterNodeContext x) {
                        String build = "<GreaterNode> >\n";
                        String rez1 = visit(x.getChild(0));
                        String rez2 = visit(x.getChild(2));
                        build += addNewline(rez1);
                        build += addNewline(rez2);
                        return build;
                }
                @Override
                public String visitAndNode(BonusParser.AndNodeContext x) {
                        String build = "<AndNode> &&\n";
                        String rez1 = visit(x.getChild(0));
                        String rez2 = visit(x.getChild(2));
                        build += addNewline(rez1);
                        build += addNewline(rez2);
                        return build;
                }
                @Override
                public String visitSeqNode(BonusParser.SeqNodeContext x) {
                        String build = "<SequenceNode>\n";
                        String rez1 = visit(x.getChild(0));
                        String rez2 = visit(x.getChild(1));
                        build += addNewline(rez1);
                        build += addNewline(rez2);
                        return build;
                }
                @Override
                public String visitBlockNode(BonusParser.BlockNodeContext x) {
                        String build = "<BlockNode> {}\n";
                        if(x.getChildCount() == 2)
                                return build;
                        String rez = visit(x.getChild(1));
                        build += addNewline(rez);
                        return build;
                }
                @Override
                public String visitIfNode(BonusParser.IfNodeContext x) {
                        String build = "<IfNode> if\n";
                        String cond = visit(x.getChild(1));
                        String body = visit(x.getChild(2));
                        String elsef = visit(x.getChild(4));
                        build += addNewline(cond);
                        build += addNewline(body);
                        build += addNewline(elsef);
                        return build;
                }
                @Override
                public String visitWhileNode(BonusParser.WhileNodeContext x) {
                        String build = "<WhileNode> while\n";
                        String cond = visit(x.getChild(1));
                        String body = visit(x.getChild(2));
                        build += addNewline(cond);
                        build += addNewline(body);
                        return build;
                }
        };
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("arbore"));
		writer.write(visitor.visit(tree));
		writer.close();    
	}
}