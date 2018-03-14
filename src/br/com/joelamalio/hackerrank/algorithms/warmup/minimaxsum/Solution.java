package br.com.joelamalio.hackerrank.algorithms.warmup.minimaxsum;

import br.com.joelamalio.hackerrank.algorithms.warmup.util.Util;

public class Solution {

	static void miniMaxSum(int[] arr) {
		final int n = arr.length;
		int notAddIndex = 0;
		long miniMaxSum[] = new long[n];
        
		for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if (j != notAddIndex) {
        			miniMaxSum[i] += arr[j];
        		}
        	}
        	notAddIndex++;
        }
        
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
        	if (miniMaxSum[i] < min) {
        		min = miniMaxSum[i];
        	}
        	
        	if (miniMaxSum[i] > max) {
        		max = miniMaxSum[i];
        	}
        }
        
        System.out.println(String.format("%d %d", min, max));
    }
	
	public static void main(String[] args) throws Exception {
		/*
		 * 0 => 14 14
		 * 1 => 2063136757 2744467344
		 * 11 => 1575456874 2357937445
		 * 12 => 2572095760 2999145560
		 */
		int[] a = Util.getInteger1Array("inputs/algorithms/warmup/minimaxsum/test-case-12");
		miniMaxSum(a);
	}

	/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
    */
	
}
