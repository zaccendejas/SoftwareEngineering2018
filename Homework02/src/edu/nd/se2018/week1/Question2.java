package edu.nd.se2018.week1;

import java.util.*;


public class Question2 {
	
	public Question2() {}
	
	public String getMostFrequentWord(String input, String stop) {
		String[] stopList = stop.split("\\s+");
		String[] inputList = input.split("\\s+");
		HashSet<String> stopWords = new HashSet<String>();
		for (String x : stopList) stopWords.add(x);
		
		int topOccur = 0;
		String topWord = null;
		Boolean oneTop = false;
		HashMap<String, Integer> wordTable = new HashMap<String, Integer>();
		
		for (String word : inputList) {
			if (stopWords.contains(word)) continue;
			
			if (wordTable.containsKey(word)) wordTable.put(word, wordTable.get(word) + 1);
			else wordTable.put(word, 1);
			
			int currVal = wordTable.get(word);
			if (currVal > topOccur) {
				oneTop = true;
				topOccur = currVal;
				topWord = word;
			}
			else if (currVal == topOccur) {
				oneTop = false;
			}
			
		}
		
		if (oneTop) return topWord;
		else return null;
		
	}
	
}
