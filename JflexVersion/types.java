import java.util.*;

abstract interface Node {
	String show();
	String interpret(HashMap<String, String> dict);
};

class MainNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<MainNode>\n";
		
		String print = "";
		print += child.show();
		build += Parser.addNewline(print); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		return child.interpret(dict);
	}

	public MainNode(Node value) {
		super();
		this.child = value;
	}

	Node child;
}

class IntNode implements Node {
	@Override
	public String show() {
		return "<IntNode> " + value + "\n";
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		return value;
	}

	public IntNode(String value) {
		super();
		this.value = value;
	}

	String value;
}

class BoolNode implements Node {
	@Override
	public String show() {
		return "<BoolNode> " + value + "\n";
	}
	@Override
	public String interpret(HashMap<String, String> dict) {	
		return value;
	}

	public BoolNode(String value) {
		super();
		this.value = value;
	}

	String value;
}

class VarNode implements Node {
	@Override
	public String show() {
		return "<VariableNode> " + value + "\n";
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		return value;
	}
	public VarNode(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	String value;
}

class PlusNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<PlusNode> +\n";
		
		String print1 = "";
		String print2 = "";
		print1 += child1.show();
		print2 += child2.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		String regex = "\\d+";
		int rez1;
		int rez2;
		String x = child1.interpret(dict);
		if(x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}

		String y = child2.interpret(dict);
		if(y.contains("<Error>")) {
			String[] parts = y.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}

		if (x.matches(regex)) {
			rez1 = Integer.parseInt(x);
		} else {
			if(!dict.containsKey(x))
				return "<Error>UnassignedVar 0";
			String info = dict.get(x);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez1 = Integer.parseInt(info);
		}

		if (y.matches(regex)) {
			rez2 = Integer.parseInt(y);
		} else {
			if(!dict.containsKey(y))
				return "<Error>UnassignedVar 0";
			String info = dict.get(y);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez2 = Integer.parseInt(info);
		}

		int rez = rez1 + rez2;
		return "" + rez;
	}

	public PlusNode(Node value1, Node value2) {
		super();
		this.child1 = value1;
		this.child2 = value2;
	}

	Node child1;
	Node child2;
}

class DivNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<DivNode> /\n";
		
		String print1 = "";
		String print2 = "";
		print1 += child1.show();
		print2 += child2.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		String regex = "\\d+";
		int rez1;
		int rez2;
		String x = child1.interpret(dict);
		if(x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}

		String y = child2.interpret(dict);
		if(y.contains("<Error>")) {
			String[] parts = y.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}

		if (x.matches(regex)) {
			rez1 = Integer.parseInt(x);
		} else {
			if(!dict.containsKey(x))
				return "<Error>UnassignedVar 0";
			String info = dict.get(x);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez1 = Integer.parseInt(info);
		}

		if (y.matches(regex)) {
			rez2 = Integer.parseInt(y);
		} else {
			if(!dict.containsKey(y))
				return "<Error>UnassignedVar 0";
			String info = dict.get(y);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez2 = Integer.parseInt(info);
		}

		if (rez2 == 0)
			return "<Error>DivideByZero 0";

		int rez = rez1 / rez2;
		return "" + rez;
	}

	public DivNode(Node value1, Node value2) {
		super();
		this.child1 = value1;
		this.child2 = value2;
	}

	Node child1;
	Node child2;
}

class BracketNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<BracketNode> ()\n";
		
		String print = "";
		print += child.show();
		build += Parser.addNewline(print); 
		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		return child.interpret(dict);
	}

	public BracketNode(Node value) {
		super();
		this.child = value;
	}

	Node child;
}

class AndNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<AndNode> &&\n";

		String print1 = "";
		String print2 = "";
		print1 += child1.show();
		print2 += child2.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		Boolean x = Boolean.parseBoolean(child1.interpret(dict));
		Boolean y = Boolean.parseBoolean(child2.interpret(dict));
		Boolean rez = x && y;
		return "" + rez;
	}

	public AndNode(Node value1, Node value2) {
		super();
		this.child1 = value1;
		this.child2 = value2;
	}

	Node child1;
	Node child2;
}

class GreaterNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<GreaterNode> >\n";

		String print1 = "";
		String print2 = "";
		print1 += child1.show();
		print2 += child2.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		String regex = "\\d+";
		int rez1;
		int rez2;
		String x = child1.interpret(dict);
		if (x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}
		if (x.matches(regex)) {
			rez1 = Integer.parseInt(x);
		} else {
			if(!dict.containsKey(x))
				return "<Error>UnassignedVar 0";
			String info = dict.get(x);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez1 = Integer.parseInt(info);
		}
		
		String y = child2.interpret(dict);
		if (y.contains("<Error>")) {
			String[] parts = y.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}
		if (y.matches(regex)) {
			rez2 = Integer.parseInt(y);
		} else {
			if(!dict.containsKey(y))
				return "<Error>UnassignedVar 0";
			String info = dict.get(y);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez2 = Integer.parseInt(info);
		}

		Boolean rez = rez1 > rez2;
		return "" + rez;
	}

	public GreaterNode(Node value1, Node value2) {
		super();
		this.child1 = value1;
		this.child2 = value2;
	}

	Node child1;
	Node child2;
}

class NotNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<NotNode> !\n";
		
		String print = "";
		print += child.show();
		build += Parser.addNewline(print); 
		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		Boolean x = Boolean.parseBoolean(child.interpret(dict));
		Boolean rez = !x;
		return "" + rez;
	}

	public NotNode(Node value) {
		super();
		this.child = value;
	}

	
	Node child;
}

class AssignmentNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<AssignmentNode> =\n";
		
		String print1 = "";
		String print2 = "";
		print1 += child1.show();
		print2 += child2.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		String x = child2.interpret(dict);
		if(x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			return parts[0] + " " + count;
		}
		String rez;
		String regex = "\\d+";
		if (x.matches(regex)) {
			rez = x;
		} else {
			String info = dict.get(x);
			if(info.equals("null"))
				return "<Error>UnassignedVar 0";
			rez = info;
		}

		String var = child1.interpret(dict);
		dict.put(var, rez);
		return "ok";
	}

	public AssignmentNode(Node value1, Node value2) {
		super();
		this.child1 = value1;
		this.child2 = value2;
	}

	Node child1;
	Node child2;
}

class BlockNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<BlockNode> {}\n";
		if (child != null) {
			String print = "";
			print += child.show();
			build += Parser.addNewline(print); 
		}
		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		if(child == null)
			return "nothing";
		return child.interpret(dict);
	}

	public BlockNode(Node value) {
		super();
		this.child = value;
	}

	Node child;
}

class IfNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<IfNode> if\n";
		
		String print1 = "";
		String print2 = "";
		String print3 = "";
		print1 += childCond.show();
		print2 += childBody.show();
		print3 += childElse.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 
		build += Parser.addNewline(print3); 

		return build;
	}

	@Override
	public String interpret(HashMap<String, String> dict) {
		String x = childCond.interpret(dict);
		if(x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			count++;
			return parts[0] + " " + count;
		}
		Boolean cond = Boolean.parseBoolean(x);
		HashMap<String, String> copy = new HashMap<>();
		for (Map.Entry<String, String> entry : dict.entrySet()) {
			copy.put(entry.getKey(),entry.getValue());
		}

		if (cond) {
			String aux = childBody.interpret(dict);
			if(aux.contains("<Error>")) {
				String[] parts = aux.split(" ");	
				int count = Integer.parseInt(parts[1]);
				count++;
				return parts[0] + " " + count;
			}
		} else {
			String aux = childElse.interpret(dict);
			if(aux.contains("<Error>")) {
				String[] parts = aux.split(" ");	
				int count = Integer.parseInt(parts[1]);
				count = 1 + count + countLines(childBody);
				return parts[0] + " " + count;
			}
		}
		return "ok";
	}

	private int countLines(Node x) {
		if (x == null) {
			return 0;
		}
		if (x instanceof AssignmentNode) {
			return 1;
		}
		if (x instanceof BlockNode) {
			return 1 + countLines(((BlockNode) x).child);
		}
		if (x instanceof IfNode) {
			return 1 + countLines(((IfNode) x).childBody) + countLines(((IfNode) x).childElse);
		}
		if (x instanceof WhileNode) {
			return 1 + countLines(((WhileNode) x).childBody);
		}
		if (x instanceof SequenceNode) {
			return countLines(((SequenceNode)x).child1) + countLines(((SequenceNode)x).child2); 
		}
		return 0;
	}
	
	public IfNode(Node cond, Node b, Node e) {
		super();
		this.childCond = cond;
		this.childBody = b;
		this.childElse = e;
	}
	Node childCond;
	Node childBody;
	Node childElse;
}

class WhileNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<WhileNode> while\n";
		
		String print1 = "";
		String print2 = "";
		String print3 = "";
		print1 += childCond.show();
		print2 += childBody.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 
		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		String x = childCond.interpret(dict);
		if(x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			count++;
			return parts[0] + " " + count;
		}
		Boolean cond = Boolean.parseBoolean(x);
		while (cond) {
			String rez = childBody.interpret(dict);
			if (rez.equals("nothing")) 
				return "ok";
			if (rez.contains("<Error>")) {
				String[] parts = rez.split(" ");	
				int count = Integer.parseInt(parts[1]);
				count++;
				return parts[0] + " " + count;
			}
			cond = Boolean.parseBoolean(childCond.interpret(dict));
		}
		return "ok";
	}

	public WhileNode(Node cond, Node b) {
		super();
		this.childCond = cond;
		this.childBody = b;
	}

	Node childCond;
	Node childBody;
}

class SequenceNode implements Node {
	@Override
	public String show() {
		String build = "";
		build += "<SequenceNode>\n";

		
		String print1 = "";
		String print2 = "";
		print1 += child1.show();
		print2 += child2.show();
		build += Parser.addNewline(print1); 
		build += Parser.addNewline(print2); 

		return build;
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		String x = child1.interpret(dict);
		if(x.contains("<Error>")) {
			return x;
		}
		x = child2.interpret(dict);
		if(x.contains("<Error>")) {
			String[] parts = x.split(" ");	
			int count = Integer.parseInt(parts[1]);
			count += countLines(child1);
			return parts[0] + " " + count;
		}

		return "ok";
	}

	private int countLines(Node x) {
		if (x == null) {
			return 0;
		}
		if (x instanceof AssignmentNode) {
			return 1;
		}
		if (x instanceof BlockNode) {
			return 1 + countLines(((BlockNode) x).child);
		}
		if (x instanceof IfNode) {
			return 1 + countLines(((IfNode) x).childBody) + countLines(((IfNode) x).childElse);
		}
		if (x instanceof WhileNode) {
			return 1 + countLines(((WhileNode) x).childBody);
		}
		if (x instanceof SequenceNode) {
			return countLines(((SequenceNode)x).child1) + countLines(((SequenceNode)x).child2); 
		}
		return 0;
	}

	public SequenceNode(Node value1, Node value2) {
		super();
		this.child1 = value1;
		this.child2 = value2;
	}

	public Node getChild1() {
		return this.child1;
	}

	Node child1;
	Node child2;
}

class SymbolNode implements Node {
	@Override
	public String show() {
		return "<Sequence> \n";
	}
	@Override
	public String interpret(HashMap<String, String> dict) {
		return "";
	}

	public SymbolNode(String symbol) {
		super();
		this.symbol = symbol;
	}

	public String getSymbol() {
		return this.symbol;
	}

	String symbol;
}