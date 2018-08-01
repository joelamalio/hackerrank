package br.com.joelamalio.hackerrank.algorithms.implementation.dayoftheprogrammer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	// Complete the solve function below.
	static String solve(int year) {
		Locale locale = new Locale("ru_RU");
		Calendar calendar = Calendar.getInstance(locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, 8);
		int dayOfYear = 31 + 31 + 30 + 31 + 30 + 31 + 31;
		
		if (year >= 1918) {
			
			if (year == 1918) {
				dayOfYear += 15;
			} else if (year > 1918 
					&& ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
				dayOfYear += 29;
			} else {
				dayOfYear += 28;
			}
			
		} else {
			
			if (year < 1918 && year % 4 == 0) {
				dayOfYear += 29;
			} else {
				dayOfYear += 28;
			}
		}
		
		calendar.set(Calendar.DAY_OF_MONTH, 256 - dayOfYear);
		
		return new SimpleDateFormat("dd.MM.yyyy").format(calendar.getTime());
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
	}
}
