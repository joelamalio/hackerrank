package br.com.joelamalio.hackerrank.algorithms.implementation.catsandamouse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String result = "";
        int differenceXZ = Math.abs(x - z);
        int differenceYZ = Math.abs(y - z);
        int difference = differenceXZ < differenceYZ ? differenceXZ : differenceYZ;

        for (int i = 0; i < difference; i++) {
        	if (z > x) {
        		x++;
        	} else {
        		x--;
        	}
        	
        	if (z > y) {
        		y++;
        	} else {
        		y--;
        	}
        }
        
        if (x == y) {
    		result = "Mouse C";
    	} else if (x == z) {
    		result = "Cat A";
    	} else if (y == z) {
    		result = "Cat B";
    	}
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
