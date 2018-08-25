package br.com.joelamalio.hackerrank.algorithms.implementation.betweentwosets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	
	/*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
    	List<Integer> arrays = new ArrayList<Integer>();
    	int max = Integer.MAX_VALUE;
    	
    	for (int item : a) {
    		if (!arrays.contains(item)) {
    			arrays.add(item);
    		}
    	}
    	for (int item : b) {
    		if (!arrays.contains(item)) {
    			arrays.add(item);
    		}
    		if (max > item) {
    			max = item;
    		}
    	}
    	
    	Set<Integer> numbers = new LinkedHashSet<Integer>();
    	for (int i = 1; i <= max; i++) {
    		boolean isFactorA = true;
    		boolean isFactorB = true;
    		
    		for (int item : a) {
    			if (i % item != 0) {
    				isFactorA = false;
    				break;
    			}
    		}
    		
    		if (isFactorA) {
    			for (int item : b) {
        			if (item % i != 0) {
        				isFactorB = false;
        				break;
        			}
        		}
    		}
    		
    		if (isFactorA && isFactorB) {
    			numbers.add(i);
    			
    		}
    	}
    	
    	return numbers.size();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }

}
