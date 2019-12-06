package main;

import lexer.Tagger;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Tagger().tag("200 + 375").toString());
	}

}
