package br.com.joelamalio.hackerrank.algorithms.implementation.equalityinaarray;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
    		int value = arr[i];
    		if (!map.containsKey(value)) {
    			map.put(value, 1);
    		} else {
    			map.put(value, map.get(value) + 1);
    		}
    	}
    	
    	int higherValue = 0;
    	int higherKey = -1;
    	for (int i : map.keySet()) {
    		int value = map.get(i);
    		
    		if (value > higherValue) {
    			higherValue = value;
    			higherKey = i;
    		}
    	}
    	
    	return arr.length - map.get(higherKey);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

