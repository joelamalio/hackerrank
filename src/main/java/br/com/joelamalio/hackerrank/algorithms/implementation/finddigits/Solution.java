package br.com.joelamalio.hackerrank.algorithms.implementation.finddigits;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    // Complete the findDigits function below.
    static int findDigits(int n) {
    	String value = String.valueOf(n);
    	List<String> list = Arrays.asList(value.split(""));
    	return (int) list.stream()
    			.mapToInt(i -> Integer.valueOf(i))
    			.filter(i -> (i > 0 && n % i == 0))
    			.count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

