package br.com.joelamalio.hackerrank.algorithms.warmup.diagonaldifference;

import java.util.Scanner;

import br.com.joelamalio.hackerrank.algorithms.warmup.util.Util;

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
		int[][] a = Util.getArray2(Solution.class, "9");
		int result = diagonalDifference(a);
	    System.out.println(result);
	}
	
	/*
	private static void main(String[] args) {
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
	*/
	
}
