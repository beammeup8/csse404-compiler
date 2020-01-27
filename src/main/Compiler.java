package main;

import java.util.List;

import dataStructures.Tag;
import dataStructures.inter1.InterProgram1;
import dataStructures.parseTree.ProgramNode;
import dataStructures.simpleInter.CodeBlock;
import lexer.Lexer;
import output.Outputter;
import parser.Parser;

public class Compiler {
	private Lexer lexer;
	private Parser parser;
	private Outputter<CodeBlock> outputter;
	
	public Compiler() {
		lexer = new Lexer();
		parser = new Parser();
		outputter = new Outputter<>();
	}
	
	public void compile(String filename){
		List<Tag> tags = lexer.analyze(filename);
		ProgramNode parseTree = parser.parse(tags);
		InterProgram1 interProgram1 = parseTree.convertToInter1();
		interProgram1.createSymbolTable();
		CodeBlock prog = interProgram1.toCodeBlock();
		outputter.output(filename, prog);
	}
	public void compile(List<String> filenames){
		for(String s: filenames){
			System.out.println("Compiling " + s);
			compile(s);
			System.out.println();
		}
	}
}
