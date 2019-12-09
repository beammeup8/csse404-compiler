package main;

import lexer.Tagger;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Tagger().tag("aaa = 6;\nSystem.out.println(aaa+5);").toString());
	}

}
