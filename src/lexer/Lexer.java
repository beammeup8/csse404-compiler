package lexer;

import dataStructures.Scope;

public class Lexer {
	private CodeReader reader;
	private Tokenizer tokenizer;
	private Tagger tagger;
	
	public  Lexer(){
		reader = new CodeReader();
		tokenizer = new Tokenizer();
		tagger = new Tagger();
	}

	public Scope analyze(String filename){
		return tagger.Tag(tokenizer.tokenize(reader.readFile(filename)));
	}
}
