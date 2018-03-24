package br.com.joelamalio.hackerrank.algorithms.warmup.staircase;

import java.util.Scanner;

public class Solution {
	
	static void staircase(int n) {
        int blankSpace = n - 1;
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < blankSpace; j++) {
        		System.out.print(" ");
        	}
        	for (int j = 0; j < n - blankSpace; j++) {
        		System.out.print("#");
        	}
        	System.out.println("");
        	blankSpace--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }

}
