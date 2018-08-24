package br.com.joelamalio.hackerrank.algorithms.implementation.designerpdfviewer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	// Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
    	final String[] letters = new String[] {"a","b","c","d","e","f","g","h","i","j", "k","l","m","n",
    			"o","p","q","r","s","t","u","v","w","x","y","z"};
    	final Map<String, Integer> values = new HashMap<String, Integer>();

    	for (int i = 0; i < h.length; i++) {
    		values.put(letters[i], h[i]);
    	}
    	
    	int tallest = 0;
    	for (String s : word.split("")) {
    		if (values.get(s) > tallest) {
    			tallest = values.get(s);
    		}
    	}
    	
    	return word.length() * 1 * tallest;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
