/**
 * PriceCalculatorTest.java
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
public class PriceCalculatorTest extends TestCase {

	private PriceCalculator price;

	@Override
	public void setUp() {
		price = new PriceCalculator();
	}

	public void testCreateCostCalculatorObject() {
		assertNotNull(price);
	}

	public void testCalculateFlatMarkup() {
		assertEquals(105.00, price.calculate(100, 0, Markup.ELSE));
	}

	public void testCalculateWorkerMarkup() {
		assertEquals(108.78, price.calculate(100, 3, Markup.ELSE));
		assertEquals(111.30, price.calculate(100, 5, Markup.ELSE));
	}

	public void testCalculateMaterialTypeMarkup() {
		assertEquals(112.88, price.calculate(100, 0, Markup.PHARMACEUTICAL));
		assertEquals(118.65, price.calculate(100, 0, Markup.FOOD));
		assertEquals(107.10, price.calculate(100, 0, Markup.ELECTRONICS));
	}

	public void testCalculateAllMarkup() {
		assertEquals(1591.58, price.calculate(1299.99, 3, Markup.FOOD));
		assertEquals(6199.81, price.calculate(5432.00, 1, Markup.PHARMACEUTICAL));
		assertEquals(13707.63, price.calculate(12456.95, 4, Markup.ELSE));
	}
}
