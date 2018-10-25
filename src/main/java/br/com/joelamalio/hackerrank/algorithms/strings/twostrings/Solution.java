package br.com.joelamalio.hackerrank.algorithms.strings.twostrings;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2) {
		s1 = removeDuplicates(s1);
		s2 = removeDuplicates(s2);
		
		for (String i : s1.split("")) {
			if (s2.contains(i)) {
				return "YES";
			}
		}
		
		return "NO";
	}
	
	public static String removeDuplicates(String string) {
        return Arrays.asList(string.split("")).stream().distinct().collect(Collectors.joining());
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();*/
		
		String s1 = "hitcwvrtvizzztsecgtez";
		String s2 = "alflkudnnayylualdlqlklyofomfoooqmnmuakdfxqxlkafxopolmaxukuopkqqpll";
		System.out.println(twoStrings(s1, s2));
		
	}
}
