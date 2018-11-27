package br.com.joelamalio.hackerrank.algorithms.bitmanipulation.maximizingxor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) {
    	int result = Integer.MIN_VALUE;
    	int temp;
    	for (int i = l; i <= r; i++) {
    		for (int j = i; j <= r; j++) {
    			temp = i ^ j;
    			
    			if (temp > result) {
    				result = temp;
    			}
    		}
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
