package br.com.joelamalio.hackerrank.algorithms.warmup.diagonaldifference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

public class Solution {
	static int diagonalDifference(int[][] a) {
		final int n = a.length;
		int diagonal1 = 0;
		int diagonal2 = 0;
		for (int i = 0; i < n; i++) {
			diagonal1 += a[i][i];
		}
		
		int iMax = n - 1;
		for (int i = 0; i <= iMax; i++) {
			diagonal2 += a[i][iMax - i];
		}
		
		int result = diagonal1 - diagonal2;
		
		return result >= 0 ? result : -result;
	}

	public static void main(String[] args) throws Exception {
		/*
		 * 3 => 15
		 * 4 => 1
		 * 9 => 52
		 */
		mainWithFile("9");
	}
	
	private static void mainWithScanner() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int result = diagonalDifference(a);
		System.out.println(result);
		in.close();
	}
	
	private static void mainWithFile(final String fileName) throws Exception {
		URL path = Solution.class.getResource(fileName);
		File file = new File(path.getFile());
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		try {
		    int n = Integer.valueOf(br.readLine());
		    int[][] a = new int[n][n];
		    String line = br.readLine();
		    int i = 0;
		    String cell[];
		    
		    while (line != null) {
		    	cell = line.split(" ");
		    	for(int j = 0; j < n; j++) {
		    		a[i][j] = Integer.valueOf(cell[j]);
		    	}
		    	i++;
		        line = br.readLine();
		    }
		    
		    int result = diagonalDifference(a);
		    System.out.println(result);
		} finally {
		    br.close();
		}
		
	}
}
