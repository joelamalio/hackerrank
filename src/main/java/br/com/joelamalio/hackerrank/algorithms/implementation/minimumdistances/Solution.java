package br.com.joelamalio.hackerrank.algorithms.implementation.minimumdistances;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	int minimumDistances = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < a.length; i++) {
    		for (int j = i + 1; j < a.length; j++) {
    			if (a[i] == a[j] && (minimumDistances > j - i)) {
    				minimumDistances = j - i;
    			}
    		}
    	}
    	
    	return minimumDistances == Integer.MAX_VALUE ? -1 : minimumDistances;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
