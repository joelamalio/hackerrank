package br.com.joelamalio.hackerrank.algorithms.implementation.migratorybirds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	// Complete the migratoryBirds function below.
	static int migratoryBirds(int[] ar) {
		Map<Integer, Integer> birds = new HashMap<Integer,  Integer>();
		for (int i = 0; i < ar.length; i++) {
			int value = 1;
			if (birds.containsKey(ar[i])) {
				value = birds.get(ar[i]) + 1;
			}
			birds.put(ar[i], value);
		}
		
		int maxAmountByType = 0;
		for (Integer type : birds.keySet()) {
			if (birds.get(type) > maxAmountByType) {
				maxAmountByType = birds.get(type);
			}
		}
		
		int result = Integer.MAX_VALUE;
		for (Integer type : birds.keySet()) {
			if (birds.get(type) == maxAmountByType) {
				
				if (type < result) {
					result = type;
				}
			}
		}
		
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = migratoryBirds(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
