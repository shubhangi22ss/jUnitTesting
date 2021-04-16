package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstr = new jUnitFunction();
		String result = junitstr.addStrings("Hello", "World");
		assertEquals ("HelloWorld", result);
	}

}
