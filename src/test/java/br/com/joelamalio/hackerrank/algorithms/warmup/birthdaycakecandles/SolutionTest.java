package br.com.joelamalio.hackerrank.algorithms.warmup.birthdaycakecandles;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.algorithms.warmup.birthdaycakecandles.Solution;
import br.com.joelamalio.hackerrank.algorithms.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		input("4");
		input("3 2 1 3");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		Assert.assertEquals(formatResult("2"), outContent.toString());
	}
	
}
