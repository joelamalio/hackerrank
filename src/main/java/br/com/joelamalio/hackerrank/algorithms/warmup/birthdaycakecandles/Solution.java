package br.com.joelamalio.hackerrank.algorithms.warmup.birthdaycakecandles;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	
	static int birthdayCakeCandles(int n, int[] ar) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < n; i++) {
			int key = ar[i];
			if (counts.containsKey(key)) {
				counts.put(key, counts.get(key) + 1);
			} else {
				counts.put(key, 1);
			}
		}
		
		return Collections.max(counts.values());
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
		in.close();
	}
	
}
