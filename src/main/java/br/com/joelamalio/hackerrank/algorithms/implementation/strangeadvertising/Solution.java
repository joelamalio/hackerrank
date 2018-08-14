package br.com.joelamalio.hackerrank.algorithms.implementation.strangeadvertising;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the viralAdvertising function below.
	static int viralAdvertising(int n) {
		int shared = 5;
		int liked;
		int cumulative = 0;
		
		for (int i = 1; i <= n; i++) {
			liked = shared / 2;
			cumulative += liked;
			shared = 3 * liked;
		}

		return cumulative;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = viralAdvertising(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
