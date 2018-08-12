package br.com.joelamalio.hackerrank.algorithms.implementation.appendanddelete;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
    	final int difference = Math.abs(s.length() - t.length());
    	String newS = new String(s);
    	String newT = new String(t);
    	
    	int modifications = 0;
    	if (s.equals(t) && k % 2 != 0) {
    		modifications = k;
    	} else if (newS.length() > newT.length()) {
			newS = newS.substring(0, difference);
			modifications = difference;
    	} 
    	
    	if (!t.equals(newS)) {
    		
    	}
    	
    	if (newS.equals(t) && modifications == k) {
    		return "Yes";
    	}    	
    	return "No";
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9).equals("Yes"));
//        System.out.println(appendAndDelete("aba", "aba", 7).equals("Yes"));
//        System.out.println(appendAndDelete("ashley", "ash", 2).equals("No"));
//        System.out.println(appendAndDelete("ash", "ashley", 2).equals("No"));
//       System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7).equals("Yes"));
//        System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 4).equals("Yes"));
        System.out.println(appendAndDelete("y", "yu", 2).equals("No"));
        
    }
}
