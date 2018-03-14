package br.com.joelamalio.hackerrank.algorithms.implementation.appleandorange;

import java.util.Scanner;

public class Solution {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		/*
		 * s = The initial position of the house
		 * t = The final position of the house
		 * a = The position the apple tree
		 * b = The position the orange tree
		 */
		int larryPoints = 0;
		for (int i = 0; i < apples.length; i++) {
			int apple = apples[i];
			
			if ((a + apple) >= s && (a + apple) <= t) {
				larryPoints++;
			}
		}
		
		int robPoints = 0;
		for (int i = 0; i < oranges.length; i++) {
			int orange = oranges[i];
			
			if ((b + orange) >= s && (b + orange) <= t) {
				robPoints++;
			}
		}
		
		System.out.println(larryPoints);
		System.out.println(robPoints);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apple, orange);
		in.close();
	}
	
	/*
	 * 0 => 1 1
	 * 1 => 0 0
	 * 11 => 5046 5659
	 */
}
