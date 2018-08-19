package br.com.joelamalio.hackerrank.algorithms.strings.strongpassword;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	final int minLength = 6;
    	final int maxItemsFound = 4;

    	final String numbers = "0123456789";
    	final String lowercase = "abcdefghijklmnopqrstuvwxyz";
    	final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	final String specialCharacters = "!@#$%^&*()-+";
    	
    	boolean foundNumber = false;
    	boolean foundLowercase = false;
    	boolean foundUppercase = false;
    	boolean foundSpecialCharacter = false;
    	int itemsFound = 0;
    	
    	for (String caracter : password.split("")) {
    		if (numbers.contains(caracter) && !foundNumber) {
    			foundNumber = true;
    			itemsFound++;
    		} else if (lowercase.contains(caracter) && !foundLowercase) {
    			foundLowercase = true;
    			itemsFound++;
    		} else if (uppercase.contains(caracter) && !foundUppercase) {
    			foundUppercase = true;
    			itemsFound++;
    		} else if (specialCharacters.contains(caracter) && !foundSpecialCharacter) {
    			foundSpecialCharacter = true;
    			itemsFound++;
    		}
    	}
    	
    	if (n >= minLength) {
			return maxItemsFound - itemsFound;
    	} else if ((minLength - n) > (maxItemsFound - itemsFound)) {
    		return minLength - n;
    	}
    	return maxItemsFound - itemsFound;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
