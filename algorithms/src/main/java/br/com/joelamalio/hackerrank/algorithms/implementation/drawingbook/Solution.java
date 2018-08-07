package br.com.joelamalio.hackerrank.algorithms.implementation.drawingbook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the pageCount function below.
	 */
	static int pageCount(int n, int p) {
		/*
		 * Write your code here.
		 */
		int numberOfPages = 0;
        if ((n / 2) >= p) {
            for (int i = 1; i < p; i++) {
                if (i % 2 != 0) {// odd
                    numberOfPages++;    
                }                
            }
        } else {
            for (int i = n; i > p; i--) {
                if (i % 2 == 0) { // even
                    numberOfPages++;    
                }                
            }
        }
        return numberOfPages;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}