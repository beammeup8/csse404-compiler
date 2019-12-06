package lexer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TokenizerTest {

	@Test
	public void crazyBasicTest() {
		Tokenizer tokenizer = new Tokenizer();
		List<String> result = tokenizer.tokenize(
				" /** This is a test. */\n class Test {\npublic static void main (String[] args) {\nSystem.out.println(2 + 13); // cool\n}\n}");
		List<String> expected = new ArrayList<String>();
		
		fail("Not yet implemented");
	}

}
