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

	@Override
	public void setUp() {
		calc = new CostCalculator();
	}

	public void testCreateCostCalculatorObject() {
		assertNotNull(calc);
	}

	public void testCalculateFlatMarkup() {
		assertEquals(105.00, calc.calculate(100, 0, Markup.ELSE));
	}

	public void testCalculateWorkerMarkup() {
		assertEquals(108.78, calc.calculate(100, 3, Markup.ELSE));
		assertEquals(111.30, calc.calculate(100, 5, Markup.ELSE));
	}

	public void testCalculateMaterialTypeMarkup() {
		assertEquals(112.88, calc.calculate(100, 0, Markup.PHARMACEUTICAL));
		assertEquals(118.65, calc.calculate(100, 0, Markup.FOOD));
		assertEquals(107.10, calc.calculate(100, 0, Markup.ELECTRONICS));
	}
}
