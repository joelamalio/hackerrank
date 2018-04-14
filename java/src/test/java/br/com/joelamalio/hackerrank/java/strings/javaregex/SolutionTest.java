package br.com.joelamalio.hackerrank.java.strings.javaregex;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		input("000.12.12.034");
		input("121.234.12.12");
		input("23.45.12.56");
		input("00.12.123.123123.123");
		input("122.23");
		input("Hello.IP");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("true");
		output("true");
		output("true");
		output("false");
		output("false");
		output("false");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
}
