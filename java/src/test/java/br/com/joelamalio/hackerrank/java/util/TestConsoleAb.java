package br.com.joelamalio.hackerrank.java.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public abstract class TestConsoleAb {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected ByteArrayInputStream inContent;
	protected StringBuilder input;
	protected StringBuilder output;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    input = new StringBuilder();
	    output = new StringBuilder();
	}

	@After
	public void restoreStreams() {
	    System.setOut(System.out);
	    System.setIn(System.in);
	}
	
	protected void input(String value) {
		input.append(value).append("\n");
	}
	
	protected void output(String value) {
		output.append(value).append("\r\n");
	}
	
	protected String formatResult(String value) {
		return value.replace(" ", "\r\n").concat("\r\n");
	}
	
}
