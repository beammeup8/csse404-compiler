package main;

import lexer.Lexer;

public class Main {

	public static void main(String[] args) {
		String filename = "dummyFile.java";
		Lexer lexer = new Lexer();
		lexer.analyze(filename);
	}

}
