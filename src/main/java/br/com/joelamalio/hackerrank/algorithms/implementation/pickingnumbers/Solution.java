package br.com.joelamalio.hackerrank.algorithms.implementation.pickingnumbers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	// Complete the pickingNumbers function below.
	static int pickingNumbers(int[] a) {
		Arrays.sort(a);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			temp = new ArrayList<Integer>();
			temp.add(i);
			for (int j = i + 1; j < a.length; j++) {
				if ((a[j] - a[i]) <= 1) {
					temp.add(j);
				}
			}
			
			if (temp.size() > list.size()) {
				list = temp;
			}
		}
		
		return list.size();
		
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

		int result = pickingNumbers(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
