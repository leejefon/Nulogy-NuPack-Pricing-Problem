/**
 * CostCalculator.java
 *
 * Written By: Jeff Lee
 * Created On: 2013/11/12
 */
package com.nulogy.nupack;

import junit.framework.TestCase;


/**
 *
 * @author Jeff Lee
 */
public class CostCalculatorTest extends TestCase {

	private CostCalculator calc;

	public void setUp() {
		calc = new CostCalculator();
	}

	public void testCreateCostCalculatorObject() {
		assertNotNull(calc);
	}

	public void testCalculateFlatMarkup() {
		assertEquals(calc.calculate(100, 0, Markup.ELSE), 105.00);
	}

	public void testCalculateWorkerMarkup() {
		assertEquals(calc.calculate(100, 3, Markup.ELSE), 108.78);
	}
}
