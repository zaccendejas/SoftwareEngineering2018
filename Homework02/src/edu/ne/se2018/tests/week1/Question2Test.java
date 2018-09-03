package edu.ne.se2018.tests.week1;

import edu.nd.se2018.week1.*;
import org.junit.Test;

public class Question2Test {

	@Test
	public void test() {
		Question2 question = new Question2();
		// can't see full lines in the pdf
		String inputString = "macvitys a mystery cat hes called the hidden paw for hes the macavity macavity macavity";
		String inputString2 = "the ideal architect should be a man of letters a skillful drawer familiar familiar familiar";
		String inputString3 = "giraffe elephant giraffe tiger tiger";
		String stopWords = "and a hes the of up but with";
		
		assert(question.getMostFrequentWord(inputString, stopWords).equals("macavity"));
		assert(question.getMostFrequentWord(inputString2, stopWords).equals("familiar"));
		assert(question.getMostFrequentWord(inputString3, stopWords) == null);
	}

}
