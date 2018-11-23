package br.com.joelamalio.hackerrank.algorithms.implementation.kangaroo;

import java.util.Scanner;

public class Solution {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		long currentPosition1;
		long currentPosition2;

		for (int i = 0; i < 10000; i++) {
			currentPosition1 = x1 + v1 * i;
			currentPosition2 = x2 + v2 * i;
						
			if (currentPosition1 == currentPosition2) {
				return "YES";
			}
			
		}
		
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        in.close();
    }
    
    /*
	 * 0 3 4 2 = YES
	 * 0 2 5 3 = NO
	 * 21 6 47 3 = NO
	 */
}
