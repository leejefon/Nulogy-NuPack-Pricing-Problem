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

	public void testCreateCostCalculatorObject() {
		CostCalculator calc = new CostCalculator();
		assertNotNull(calc);
	}
}
