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
		List<Tag >tags = tagger.tag(reader.readFile(filename));
		return tags;
	}
}
