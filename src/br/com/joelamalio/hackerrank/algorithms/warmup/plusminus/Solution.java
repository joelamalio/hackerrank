package br.com.joelamalio.hackerrank.algorithms.warmup.plusminus;

import br.com.joelamalio.hackerrank.algorithms.warmup.util.Util;

public class Solution {
	
	static void plusMinus(int[] arr) {
		int contPositive = 0;
		int contZero = 0;
		int contNegative = 0;
		double n = arr.length;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				contPositive++;
			} else if (arr[i] < 0) {
				contNegative++;
			} else {
				contZero++;
			}
		}
		
		System.out.println(String.format("%f", contPositive / n).replace(",", "."));
		System.out.println(String.format("%f", contNegative / n).replace(",", "."));
		System.out.println(String.format("%f", contZero / n).replace(",", "."));
	}
	
	public static void main(String[] args) throws Exception {
		/*
		 * 6 => 0.500000 0.333333 0.166667
		 */
		int[] a = Util.getInteger1ArrayNElements("inputs/algorithms/warmup/plusminus/test-case-6");
		plusMinus(a);
	    
	}

	/*
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
		in.close();
	}
	*/
}
