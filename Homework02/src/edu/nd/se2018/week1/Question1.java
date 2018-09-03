package edu.nd.se2018.week1;

import java.util.*;


public class Question1 {

	public Question1() {}
	
	public int getSumWithoutDuplicates(int[] numberVector) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		int total = 0;
		for (int x : numberVector) {
			if (!hashSet.contains(x)) {
				total += x;
			}
			hashSet.add(x);
		}
		return total;
	}
}
