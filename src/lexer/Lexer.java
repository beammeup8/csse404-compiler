package lexer;

import java.util.List;

import dataStructures.Tag;

public class Lexer {
	private CodeReader reader;
	private Tagger tagger;
	
	public  Lexer(){
		reader = new CodeReader();
		tagger = new Tagger();
	}

	public List<Tag> analyze(String filename){
		return tagger.tag(reader.readFile(filename));
	}
}
