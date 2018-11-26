package br.com.joelamalio.hackerrank.algorithms.strings.stringconstruction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
    	 final String[] letters = new String[] {"a","b","c","d","e","f","g","h","i","j", "k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
         int cost = 0;

         for (int i = 0; i < letters.length; i++) {
             if (s.contains(letters[i])) {
                 cost++;
             }
         }
         
         return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

