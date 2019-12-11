package lexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CodeReader {

	public String readFile(String filename) {
		return stripComments(readInFile(filename));
	}

	private String stripComments(String s) {
		char[] letters = s.toCharArray();
		int len = s.length();
		StringBuilder builder = new StringBuilder(len);
		boolean inBlockComment = false;
		boolean inLineComment = false;
		for (int i = 0; i < len; i++) {
			if (inBlockComment) {
				if (letters[i] == '*' && i < len - 1 && letters[i + 1] == '/') {
					inBlockComment = false;
					i++;
				}
			} else if (inLineComment) {
				if (letters[i] == '\n') {
					inLineComment = false;
				}
			} else {
				if (letters[i] == '/' && i < len - 1) {
					if (letters[i + 1] == '*') {
						inBlockComment = true;
						i++;
					}
					if (letters[i + 1] == '/') {
						inLineComment = true;
						i++;
					}
				} else {
					builder.append(letters[i]);
				}
			}

		}
		return builder.toString();
	}

	private String readInFile(String filename) {
		StringBuilder builder = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(filename))) {
			while (scanner.hasNext()) {
				builder.append(scanner.nextLine() + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		return builder.toString();
	}
}
