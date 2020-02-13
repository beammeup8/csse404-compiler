package main;

import java.util.ArrayList;
import java.util.List;

import dataStructures.Tag;
import dataStructures.inter1.InterProgram1;
import dataStructures.parseTree.ProgramNode;
import dataStructures.simpleInter.Program;
import dataStructures.x86.ProgramX86;
import lexer.Lexer;
import optimizers.Optimizer;
import output.Outputter;
import parser.Parser;

public class Compiler {
	private Lexer lexer;
	private Parser parser;
	private List<Optimizer> optimizers;
	private Outputter<ProgramX86> outputter;
	
	public Compiler() {
		lexer = new Lexer();
		parser = new Parser();
		optimizers = new ArrayList<Optimizer>();
		outputter = new Outputter<>();
		
	}
	
	public void addOptimizer(Optimizer optimizer){
		optimizers.add(optimizer);
	}
	
	public void compile(String filename){
		List<Tag> tags = lexer.analyze(filename);
		ProgramNode parseTree = parser.parse(tags);
		InterProgram1 interProgram1 = parseTree.convertToInter1();
		interProgram1.createSymbolTable();
		Program prog = interProgram1.toCodeBlock(filename);
		ProgramX86 x86Prog = prog.toX86();
		optimize(x86Prog);
		outputter.output(filename, x86Prog);
	}
	
	private void optimize(ProgramX86 x86Prog){
		int totalChanges = 0;
		int changesThisPass = 1;
		while(changesThisPass != 0){
			changesThisPass = 0;
			for(Optimizer opt: optimizers){
				int changes = opt.optimize(x86Prog);
				System.out.println("Optimizer " + opt.getName() + " made " + changes + " changes");
				changesThisPass += changes;
			}
			System.out.println("Changes this pass: " + changesThisPass);
			totalChanges += changesThisPass;
		}
		System.out.println("Total changes made by optimizers: " + totalChanges);
	}
	
	public void compile(List<String> filenames){
		for(String s: filenames){
			System.out.println("Compiling " + s);
			compile(s);
			System.out.println();
		}
	}
}
