package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> filesToCompile = new ArrayList<String>();
		//add files
		filesToCompile.add("sampleCode/shortExample.java");
		
		//run
		Compiler compiler = new Compiler();
		compiler.compile(filesToCompile);
	}

}
