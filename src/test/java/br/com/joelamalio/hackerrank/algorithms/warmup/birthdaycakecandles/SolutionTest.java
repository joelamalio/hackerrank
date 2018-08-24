package br.com.joelamalio.hackerrank.algorithms.warmup.birthdaycakecandles;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.algorithms.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		setInputFileByPath("warmup/birthdaycakecandles/testCase0_input.txt");
		setOutputFileByPath("warmup/birthdaycakecandles/testCase0_output.txt");
		Solution.main(new String[] {});

		Assert.assertEquals(output.toString(), outContent.toString());
	}

}
