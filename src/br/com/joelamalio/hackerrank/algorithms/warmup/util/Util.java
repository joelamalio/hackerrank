package br.com.joelamalio.hackerrank.algorithms.warmup.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class Util {
	
	public static int[] getInteger1Array(String fileName) throws Exception {
		BufferedReader br = getBufferedReader(fileName);

		try {
			String line = br.readLine();
			String cell[] = line.split(" ");
			int n = cell.length;
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = Integer.valueOf(cell[i]);
			}

			return a;
		} finally {
			br.close();
		}
	}
	
	public static int[] getInteger1ArrayNElements(String fileName) throws Exception {
		BufferedReader br = getBufferedReader(fileName);

		try {
			int n = Integer.valueOf(br.readLine());
			int[] a = new int[n];
			String line = br.readLine();
			String cell[];

			while (line != null) {
				cell = line.split(" ");
				for (int j = 0; j < n; j++) {
					a[j] = Integer.valueOf(cell[j]);
				}
				line = br.readLine();
			}

			return a;
		} finally {
			br.close();
		}
	}
	
	public static int[][] getInteger2ArrayNElements(String fileName) throws Exception {
		BufferedReader br = getBufferedReader(fileName);

		try {
			int n = Integer.valueOf(br.readLine());
			int[][] a = new int[n][n];
			String line = br.readLine();
			int i = 0;
			String cell[];

			while (line != null) {
				cell = line.split(" ");
				for (int j = 0; j < n; j++) {
					a[i][j] = Integer.valueOf(cell[j]);
				}
				i++;
				line = br.readLine();
			}

			return a;
		} finally {
			br.close();
		}
	}
	
	private static BufferedReader getBufferedReader(String fileName) throws Exception {
		URL path = Util.class.getClassLoader().getResource(fileName);
		File file = new File(path.getFile());
		FileReader reader = new FileReader(file);
		return new BufferedReader(reader);
	}

}
