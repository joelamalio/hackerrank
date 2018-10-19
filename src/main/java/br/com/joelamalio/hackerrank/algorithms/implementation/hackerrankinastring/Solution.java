package br.com.joelamalio.hackerrank.algorithms.implementation.hackerrankinastring;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
    	Pattern p = Pattern.compile("(\\w*h\\w*a\\w*c\\w*k\\w*e\\w*r\\w*r\\w*a\\w*n\\w*k\\w*)");  
    	Matcher m = p.matcher(s);  
    	
    	if (m.matches()) {
    		return "YES";
    	}
    	return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    	
    }
}
