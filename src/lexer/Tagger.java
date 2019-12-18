package lexer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import dataStructures.Tag;
import dataStructures.LexerType;

public class Tagger {
	private Set<String> reservedWords;

	public Tagger() {
		reservedWords = new HashSet<>();
		reservedWords.add("class");
		reservedWords.add("public");
		reservedWords.add("static");
		reservedWords.add("extends");
		reservedWords.add("void");
		reservedWords.add("int");
		reservedWords.add("boolean");
		reservedWords.add("if");
		reservedWords.add("else");
		reservedWords.add("while");
		reservedWords.add("return");
		reservedWords.add("null");
		reservedWords.add("true");
		reservedWords.add("false");
		reservedWords.add("this");
		reservedWords.add("new");
		reservedWords.add("String");
		reservedWords.add("main");
		reservedWords.add("System.out.println");
		reservedWords.add("private");
		reservedWords.add("protected");
		reservedWords.add("for");
	}

	public List<Tag> tag(String code) {
		List<Tag> tags = new ArrayList<>();
		String[] pieces = code.split("[ \n\t\r]");
		Stack<String> stack = new Stack<>();
		addToStack(pieces, stack);
		while (!stack.isEmpty()) {
			String s = stack.pop();
			if (s.equals("")) {
				continue;
			}
			LexerType type = getType(s);
			if (type != LexerType.Unknown) {
				tags.add(new Tag(type, s));
			} else {
				splitToStack(s, stack);
			}
		}
		checkSpecialCases(tags);
		return tags;
	}
	
	private void checkSpecialCases(List<Tag> tags) {
		// check for System.out.println
		for (int i = 0; i < tags.size() - 4; i++) {
			if (tags.get(i).symbol.equals("System")) {
				if (tags.get(i+1).symbol.equals(".")) {
					if (tags.get(i+2).symbol.equals("out")) {
						if (tags.get(i+3).symbol.equals(".")) {
							if (tags.get(i+4).symbol.equals("println")) {
								tags.remove(i+4);
								tags.remove(i+3);
								tags.remove(i+2);
								tags.remove(i+1);
								tags.set(i, new Tag(LexerType.ReservedWord, "System.out.println"));
							} else {
								i += 3;
							}
						} else {
							i += 2;
						}
					} else {
						i++;
					}
				}
			}
		}
	}
	
	private void addToStack(String[] arr, Stack<String> stack) {
		for (int i = arr.length - 1; i >= 0; i--) {
			stack.push(arr[i]);
		}
	}
	
	private void splitToStack(String token, Stack<String> stack) {
		StringBuilder current = new StringBuilder(token.length());
		char c1 = token.charAt(token.length() - 1);
		char c2;
		String last2;
		
		for (int i = token.length() - 2; i >= 0; i--) {
			c2 = c1;
			c1 = token.charAt(i);
			last2 = "" + c1 + c2;
			if (isOperator(last2)) {
				stack.push(current.reverse().toString());
				current = new StringBuilder(token.length());
				stack.push(last2);
				i--;
			} else if (isOperator(c2) || isDelimiter(c2)) {
				stack.push(current.reverse().toString());
				current = new StringBuilder(token.length());
				stack.push("" + c2);
			} else {
				current.append(c2);
			}
		}
		if (isOperator(c1) || isDelimiter(c1)) {
			stack.push(current.reverse().toString());
			stack.push("" + c1);
		} else {
			current.append(c1);
			stack.push(current.reverse().toString());
		}
		
	}

	private LexerType getType(String token) {		
		if (isReservedWord(token)) {
			return LexerType.ReservedWord;
		} else if (isInteger(token)) {
			return LexerType.Integer;
		} else if (isOperator(token)) {
			return LexerType.Operator;
		} else if (isDelimiter(token)) {
			return LexerType.Delimiter;
		} else if (isID(token)) {
			return LexerType.ID;
		}

		return LexerType.Unknown;
	}
	
	private boolean isReservedWord(String s) {
		return reservedWords.contains(s);
	}
	
	private boolean isInteger(String s) {
		char[] digits = s.toCharArray();
		if (digits[0] == '0' && s.length() > 1) {
			return false;
		}
		for (char c : digits) {
			if (!isDigit(c)) {
				return false;
			}
		}

		return true;
	}
	
	private boolean isID(String s) {
		char[] digits = s.toCharArray();
		if (!isLetter(digits[0]) && digits[0] != '_') {
			return false;
		}
		for (char c : digits) {
			if (!isDigit(c) && ! isLetter(c) && c != '_') {
				return false;
			}
		}
		return true;
	}
	
	private boolean isDelimiter(String s) {
		if (s.length() != 1) {
			return false;
		}
		return isDelimiter(s.charAt(0));
	}
	
	private boolean isOperator(String s) {
		if (s.length() == 1) {
			return isOperator(s.charAt(0));
		} else if (s.equals("<=") || s.equals(">=") || s.equals("==") || s.equals("!=") || s.equals("&&") || s.equals("||")) {
			return true;
		}
		return false;
	}

	private boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	private boolean isLetter(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

	private boolean isOperator(char c) {
		return c == '+' || c == '*' || c == '-' || c == '/' || c == '!' || c == '>' || c == '<';
	}

	private boolean isDelimiter(char c) {
		return c == ';' || c == '.' || c == ',' || c == '=' || c == '(' || c == ')' || c == '{' || c == '}' || c == '['
				|| c == ']';
	}
}
