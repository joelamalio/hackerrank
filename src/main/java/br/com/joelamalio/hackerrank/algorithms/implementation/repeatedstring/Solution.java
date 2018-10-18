package br.com.joelamalio.hackerrank.algorithms.implementation.repeatedstring;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		final char A = 'a';
		if (s.equals(String.valueOf(A))) {
			return n;
		}
		
		long counterA = s.chars().mapToObj(ch -> (char) ch).filter(ch -> A == ch).count();
		long counterRepetitionA = n / s.length();
		long rest = n % s.length();
		long counterRepetitionAExtra = s.substring(0, (int) rest).chars().mapToObj(ch -> (char) ch).filter(ch -> A == ch).count();

		return counterA * counterRepetitionA + counterRepetitionAExtra;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
