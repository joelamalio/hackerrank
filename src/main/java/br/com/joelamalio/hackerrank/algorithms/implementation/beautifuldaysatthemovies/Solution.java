package br.com.joelamalio.hackerrank.algorithms.implementation.beautifuldaysatthemovies;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int quantity = 0;
		for (int number = i; number <= j; number++) {
			int reverse = Integer.valueOf(new StringBuilder(number + "").reverse().toString());
			if (Math.abs(number - reverse) % k == 0) {
				quantity++;
			}
		}
		return quantity;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] ijk = scanner.nextLine().split(" ");

		int i = Integer.parseInt(ijk[0]);

		int j = Integer.parseInt(ijk[1]);

		int k = Integer.parseInt(ijk[2]);

		int result = beautifulDays(i, j, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
