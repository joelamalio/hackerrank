package br.com.joelamalio.hackerrank.java.datastructures.javadequeue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public abstract class TestConsoleAb {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected ByteArrayInputStream inContent;
	protected StringBuilder input;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(System.out);
	    System.setIn(System.in);
	}
	
}
