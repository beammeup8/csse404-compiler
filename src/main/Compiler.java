package main;

import java.util.List;

import dataStructures.Tag;
import lexer.Lexer;
import output.Outputter;

public class Compiler {
	private Lexer lexer;
	private Outputter<Tag> outputter;
	
	public Compiler() {
		lexer = new Lexer();
		outputter = new Outputter<Tag>();
	}
	
	public void compile(String filename){
		List<Tag> tags = lexer.analyze(filename);
		outputter.output(filename, tags);
	}
	public void compile(List<String> filenames){
		for(String s: filenames){
			System.out.println("Compiling " + s);
			compile(s);
			System.out.println();
		}
	}
}
