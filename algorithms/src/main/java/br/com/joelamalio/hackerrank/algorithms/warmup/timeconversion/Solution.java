package br.com.joelamalio.hackerrank.algorithms.warmup.timeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	static String timeConversion(String s) {
		DateFormat dateFormatInput = new SimpleDateFormat("hh:mm:ssa");
		DateFormat dateFormatOuput = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = dateFormatInput.parse(s);
			return dateFormatOuput.format(date);
		} catch (ParseException e) {
		}
		return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
	
}
