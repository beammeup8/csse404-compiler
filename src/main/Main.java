package main;

import java.util.ArrayList;
import java.util.List;

import optimizers.RemoveEmptyCodeBlocks;

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
		filesToCompile.add("sampleCode/TreeVisitor.java");
		
		//run
		Compiler compiler = new Compiler();
		compiler.addOptimizer(new RemoveEmptyCodeBlocks());
		compiler.compile(filesToCompile);
	}

}
