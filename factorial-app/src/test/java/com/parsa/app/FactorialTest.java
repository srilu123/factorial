/**
 * 
 */
package com.parsa.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ramesh
 *
 */
public class FactorialTest {

	Factorial fact;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fact = new Factorial();
	}

	/**
	 * Test method for {@link com.parsa.app.Factorial#getFactorial(int)}.
	 */
	@Test
	public void testGetFactorialOfZero() {
		assertEquals(1, fact.getFactorial(0));
	}
	
	@Test
	public void testGetFactorialOfOne() {
		assertEquals(1, fact.getFactorial(1));
	}
	@Test
	public void testGetFactorialOfTwo(){
		assertEquals(2,fact.getFactorial(2));
	}
	@Test
	
	public void testGetFactorialOfHundred(){
		assertEquals(3628800,fact.getFactorial(10));
	}
	@Test
	public void testGetFactorialOfNegative(){
		assertEquals(-2,fact.getFactorial(-2));
	}
	

}
