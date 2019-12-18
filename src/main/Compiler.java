package main;

import java.util.List;

import dataStructures.Tag;
import dataStructures.parseTree.Node;
import lexer.Lexer;
import output.Outputter;
import parser.Parser;

public class Compiler {
	private Lexer lexer;
	private Parser parser;
	private Outputter<Node> outputter;
	
	public Compiler() {
		lexer = new Lexer();
		parser = new Parser();
		outputter = new Outputter<Node>();
	}
	
	public void compile(String filename){
		List<Tag> tags = lexer.analyze(filename);
		Node parseTree = parser.parse(tags);
		outputter.output(filename, parseTree);
	}
	public void compile(List<String> filenames){
		for(String s: filenames){
			System.out.println("Compiling " + s);
			compile(s);
			System.out.println();
		}
	}
}
