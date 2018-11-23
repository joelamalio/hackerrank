package br.com.joelamalio.hackerrank.algorithms.implementation.gradingstudents;

import java.util.Scanner;

public class Solution {
	
	static int[] solve(int[] grades) {
		int n = grades.length;
		int points;
		
		for (int i = 0; i < n; i++) {
			points = grades[i];
			
			if (points >= 38) {
				if (points % 5 == 3) {
					points += 2; 
				} else if (points % 5 == 4) {
					points += 1; 
				}
				
				grades[i] = points;
			}
			
		}
		
		return grades;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		in.close();
	}
}
