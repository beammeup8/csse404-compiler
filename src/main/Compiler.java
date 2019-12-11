package main;

import java.util.List;

import dataStructures.Tag;
import lexer.Lexer;

public class Compiler {
	private Lexer lexer;
	
	public Compiler() {
		lexer = new Lexer();
	}
	
	public void compile(String filename){
		List<Tag> tags = lexer.analyze(filename);
		for(int i = 0; i < tags.size(); i++){
			System.out.println(tags.get(i).toString());
		}
	}
	public void compile(List<String> filenames){
		for(String s: filenames){
			compile(s);
		}
	}
}
