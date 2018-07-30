package br.com.joelamalio.hackerrank.algorithms.implementation.countingvalleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int amountValleys = 0;
        int level = 0;
        char currentPosition; 
        
        for (int i = 0; i < s.length(); i++) {
            currentPosition = s.charAt(i);
            
            if ('U' == currentPosition) {
                level++;
            } else if ('D' == currentPosition) {
                level--; 
            }
            
            if (level == 0 && currentPosition == 'U') {
                amountValleys++;
            }
        }
        
        return amountValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
