package main;

import java.util.ArrayList;
import java.util.List;

import optimizers.CollapseMemChain;
import optimizers.ImmediateInLiner;
import optimizers.MinimizeMemLookup;
import optimizers.RemoveInstantOverwrite;
import optimizers.RemoveUnusedAssignments;
import optimizers.WriteReadToWrite;


public class Main {

	public static void main(String[] args) {
		List<String> filesToCompile = new ArrayList<String>();
		//add files
		filesToCompile.add("sampleCode/BinarySearch.java");
		filesToCompile.add("sampleCode/BinaryTree.java");
		filesToCompile.add("sampleCode/BubbleSort.java");
		filesToCompile.add("sampleCode/Factorial.java");
		filesToCompile.add("sampleCode/LinearSearch.java");
		filesToCompile.add("sampleCode/LinkedList.java");
		filesToCompile.add("sampleCode/QuickSort.java");
		filesToCompile.add("sampleCode/shortExample.java");
		filesToCompile.add("sampleCode/shortExample2.java");
		filesToCompile.add("sampleCode/shortExample3.java");
		filesToCompile.add("sampleCode/TreeVisitor.java");
		
		Compiler compiler = new Compiler();
		
		//add optimazers here
		compiler.addOptimizer(new ImmediateInLiner());
		compiler.addOptimizer(new CollapseMemChain());
		compiler.addOptimizer(new WriteReadToWrite());
		compiler.addOptimizer(new RemoveUnusedAssignments());
		compiler.addOptimizer(new RemoveInstantOverwrite());
		compiler.addOptimizer(new MinimizeMemLookup());
		
		//run
		compiler.compile(filesToCompile);
	}

}
