package edu.nd.se2018.week1;

public class Question3 {
	
	public Question3() {}
	
	public int getMirrorCount(int[] intVector) {
		int n = intVector.length;
		if (n == 0) return 0;
		int[][] subTable = new int[n][n];
		
		for (int i = 0; i < n; i++) subTable[i][i] = 1;
		
		for (int subLength = 2; subLength <= n; subLength++) {
			for(int i = 0; i <n-subLength+1; i++) {
				int j = i + subLength-1;
				if (intVector[i] == intVector[j] && subLength == 2) subTable[i][j] = 2;
				else if (intVector[i] == intVector[j]) subTable[i][j] = subTable[i+1][j-1] + 2;
				else {
					subTable[i][j] = (subTable[i][j-1] > subTable[i+1][j]) ? subTable[i][j-1] : subTable[i+1][j];
				}
			}
		}
		
		return subTable[0][n-1];
	}

}
