// Author: Petre Cosmin

import java.io.*;
import java.util.*;

public class Parser {
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

	static Node theEnd(HelloLexer l) {
		Node last = l.stack.pop();
		while (!l.stack.empty()) {
			Node aux = l.stack.pop();
			last = new SequenceNode(aux, last);
		}
		return last;
	}
	
	public static void main (String[] args) throws IOException {
		HelloLexer l = new HelloLexer(new FileReader("input"));
		l.yylex();
		HashMap<String, String> dict = new HashMap<>();
		while (!l.variables.empty()) {
			dict.put(l.variables.pop().getValue(), "null");
		}
		Node end = new MainNode(theEnd(l));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("arbore"));
		writer.write(end.show());
		writer.close();
		
		writer = new BufferedWriter(new FileWriter("output"));
		String rez = end.interpret(dict);
		if (rez.contains("<Error>")) {
			String[] parts = rez.split(" ");
			int count = Integer.parseInt(parts[1]);
			count+=2;
			writer.write(parts[0].replace("<Error>", "") + " " + count + "\n");
		} else {
			for (Map.Entry<String, String> entry : dict.entrySet()) {
				writer.write(entry.getKey() + "=" + entry.getValue() + "\n");
			}
		}
		writer.close();
	}
}