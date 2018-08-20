package br.com.joelamalio.hackerrank.algorithms.strings.marsexploration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the marsExploration function below.
    static int marsExploration(String s) {
    	final String[] sos = {"S", "O", "S"};
    	final String[] arrayS = s.split("");
    	int errors = 0;
    	for (int i = 0; i < arrayS.length; i++) {
    		int j = i % 3;
    		if (!sos[j].equals(arrayS[i])) {
    			errors++;
    		}
    	}
    	return errors;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
