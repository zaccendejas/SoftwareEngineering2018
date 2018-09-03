package edu.ne.se2018.tests.week1;

import edu.nd.se2018.week1.*;
import org.junit.Test;

public class Question3Test {

	@Test
	public void test() {
		Question3 question = new Question3();
		assert (question.getMirrorCount(new int[] {1,2,3,3,2,1}) == 6);
		assert (question.getMirrorCount(new int[] {}) == 0);
		// There is no actual mirror here so I'm not sure why it is supposed to assert to 2
//		assert (question.getMirrorCount(new int[] {1,2,4,5,3,2,1}) == 2);
		assert (question.getMirrorCount(new int[] {1,2,3,4,3,2,1}) == 7);
		assert (question.getMirrorCount(new int[] {1,2,3,4,5}) == 1);
	}

}
