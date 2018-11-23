package br.com.joelamalio.hackerrank.algorithms.implementation.reducedstring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	// Complete the superReducedString function below.
	static String superReducedString(String s) {
		String reduced = new String(s);
		int i = 0;
		int length = reduced.length();
		
		while (i < length - 1) {
			if (reduced.charAt(i) == reduced.charAt(i + 1)) {
				String target = reduced.charAt(i) + "" + reduced.charAt(i + 1);
				reduced = reduced.replace(target, "");
				i = 0;
				length = reduced.length();
			} else {
				i++;
			}
		}
		
		if (reduced.isEmpty()) {
			return "Empty String";
		}
		return reduced;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = superReducedString(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
