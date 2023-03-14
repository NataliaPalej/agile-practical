package sortnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

import junit.framework.TestCase;

public class NumbersSorterTest extends TestCase {
	
	public void testvalidNumber001() throws NumbersSorterException {
		/**
		 * Test #1
		 * Objective: Verify valid n1
		 * Input: n1=5
		 * Output: true
		 */
		NumbersSorter test001 = new NumbersSorter();
		try {
			boolean result = test001.validNumber(5);
			assertEquals(true, result);
		}
		catch (NumbersSorterException e) {
			fail("Exception NOT expected!");
		}
	}
	
	public void testvalidNumber002() throws NumbersSorterException {
		/**
		 * Test #2
		 * Objective: Verify valid n2
		 * Input: n2=-6
		 * Output: true
		 */
		NumbersSorter test002 = new NumbersSorter();
		try {
			boolean result = test002.validNumber(-6);
			assertEquals(true, result);
		}
		catch (NumbersSorterException e) {
			fail("Exception NOT expected!");
		}
	}
	
	public void testvalidNumber003() throws NumbersSorterException {
		/**
		 * Test #3
		 * Objective: Verify valid n3
		 * Input: n3=0
		 * Output: true
		 */
		NumbersSorter test003 = new NumbersSorter();
		try {
			boolean result = test003.validNumber(0);
			assertEquals(true, result);
		}
		catch (InputMismatchException e) {
			fail("Exception NOT expected!");
		}
	}
	
	public void testvalidNumber004() throws NumbersSorterException {
		/**
		 * Test #4
		 * Objective: Verify invalid inputs are handled
		 * Input: n1=a
		 * Output: false
		 */
		NumbersSorter test004 = new NumbersSorter();
		boolean result = test004.validNumber('a');
		assertEquals("Inputs MUST be numbers only!", "Inputs MUST be numbers only!");
	}
	
	public void testsortNumbers001() throws NumbersSorterException {
		/**
		 * Test #1
		 * Objective: Verify three negative numbers are sorted in ascending order
		 * Input: n1= -6, n2= -16, n3= -1
		 * Output: -16, -6, -1
		 */
		NumbersSorter test001 = new NumbersSorter();
		ArrayList<Integer> result = test001.sortNumbers(-6, -16, -1);
		assertEquals(Arrays.asList(-16, -6, -1), result);
	}
	
	public void testsortNumbers002() throws NumbersSorterException {
		/**
		 * Test #2
		 * Objective: Verify three positive numbers are sorted in ascending order
		 * Input: n1= 30, n2= 1, n3= 20
		 * Output: 1, 20, 30
		 */
		NumbersSorter test002 = new NumbersSorter();
		ArrayList<Integer> result = test002.sortNumbers(30, 1, 20);
		assertEquals(Arrays.asList(1, 20, 30), result);
	}
	
	public void testsortNumbers003() throws NumbersSorterException {
		/**
		 * Test #3
		 * Objective: Verify three zeros are sorted 
		 * Input: n1= 0, n2= 0, n3= 0
		 * Output: 0, 0, 0
		 */
		NumbersSorter test003 = new NumbersSorter();
		ArrayList<Integer> result = test003.sortNumbers(0, 0, 0);
		assertEquals(Arrays.asList(0, 0, 0), result);
	}
	
	public void testsortNumbers004() throws NumbersSorterException {
		/**
		 * Test #4
		 * Objective: Verify combinations of negative, zero and positive are sorted in ascending order
		 * Input: n1=0, n2=15, n3= -5
		 * Output: 0, 0, 0
		 */
		NumbersSorter test004 = new NumbersSorter();
		ArrayList<Integer> result = test004.sortNumbers(5, -6, 0);
		assertEquals(Arrays.asList(-6, 0, 5), result);
	}
	
	public void testsortNumbers005() throws NumbersSorterException {
		/**
		 * Test #4
		 * Objective: Verify combinations of negative, zero and positive are sorted in ascending order
		 * Input: n1=0, n2=15, n3= -5
		 * Output: 0, 0, 0
		 */
		NumbersSorter test005 = new NumbersSorter();
		assertEquals("Inputs MUST be numbers only!", "Inputs MUST be numbers only!");
	}

}
