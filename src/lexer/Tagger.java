package lexer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataStructures.Tag;
import dataStructures.Type;

public class Tagger {
	private Map<String, Type> knownTypes;

	public Tagger() {
		knownTypes = getTypeMap();
	}

	private Map<String, Type> getTypeMap() {
		Map<String, Type> typeMap = new HashMap<String, Type>();
		return typeMap;
	}

	public List<Tag> tag(String code) {
		List<Tag> tags = new ArrayList<Tag>();
		String[] pieces = code.split(" ");
		for (String s : pieces) {
			s = s.trim();
			if (s.equals("")) {
				continue;
			}
			tags.add(new Tag(getType(s), s));
		}
		return tags;
	}

	private Type getType(String token) {
		if (token.length() == 1) {
			char c = token.charAt(0);
			if (isLetter(c)) {
				return Type.Letter;
			}
			if (isOperator(c)) {
				return Type.Operator;
			}
			if (isDelimiter(c)) {
				return Type.Delimiter;
			}
			if (isWhiteSpace(c)) {
				return Type.Whitespace;
			}
		}

		if (isInteger(token)) {
			return Type.Integer;
		}
		
		if (isID(token)) {
			return Type.ID;
		}

		return Type.Unknown;
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
		if (!isLetter(digits[0])) {
			return false;
		}
		for (char c : digits) {
			if (!isDigit(c) && ! isLetter(c)) {
				return false;
			}
		}
		return true;
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
	
	private boolean isWhiteSpace(char c){
		return c == '\n' || c == '\t' || c == ' ';
	}
}
