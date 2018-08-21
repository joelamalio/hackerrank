package br.com.joelamalio.hackerrank.algorithms.strings.anagram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the anagram function below.
    static int anagram(String s) {
    	if (s.length() % 2 != 0) {
    		return -1;
    	}
    	
    	int half = s.length() / 2;
    	String[] s1 = s.substring(0, half).split("");
    	String[] s2 = s.substring(half).split("");
    	int variation = 0;
    	boolean found;
    	
    	for (int i = 0; i < s1.length; i++) {
    		found = false;
    		for (int j = 0; j < s2.length; j++) {
        		if (s1[i].equals(s2[j])) {
        			found = true;
        			s1[i] = null;
        			s2[j] = null;
        			break;
        		}
        	}
    		
    		if (!found) {
    			variation++;
    		}
    	}
    	
    	return variation;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
