/**
 * CostCalculator.java
 *
 * Written By: Jeff Lee
 * Created On: 2013/11/12
 */
package com.nulogy.nupack;


/**
 *
 * @author Jeff Lee
 */
public class CostCalculator {

	public double calculate(double basePrice, int numWorkers, Markup type) {
		double finalPrice;

		finalPrice = basePrice * (1 + type.markup());

		return finalPrice;
	}
}