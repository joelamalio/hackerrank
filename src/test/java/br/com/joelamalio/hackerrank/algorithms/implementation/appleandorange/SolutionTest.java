package br.com.joelamalio.hackerrank.algorithms.implementation.appleandorange;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.algorithms.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		setInputFileByPath("implementation/appleandorange/testCase0_input.txt");
		setOutputFileByPath("implementation/appleandorange/testCase0_output.txt");
		Solution.main(new String[] {});

		Assert.assertEquals(output.toString(), outContent.toString());
	}

	@Test
	public void testCase1() {
		setInputFileByPath("implementation/appleandorange/testCase1_input.txt");
		setOutputFileByPath("implementation/appleandorange/testCase1_output.txt");
		Solution.main(new String[] {});

		Assert.assertEquals(output.toString(), outContent.toString());
	}

	@Test
	public void testCase11() {
		setInputFileByPath("implementation/appleandorange/testCase11_input.txt");
		setOutputFileByPath("implementation/appleandorange/testCase11_output.txt");
		Solution.main(new String[] {});

		Assert.assertEquals(output.toString(), outContent.toString());

	}

}
