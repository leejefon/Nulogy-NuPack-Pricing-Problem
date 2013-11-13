/**
 * PriceCalculator.java
 *
 * Written By: Jeff Lee
 * Created On: 2013/11/12
 */
package com.nulogy.nupack;


/**
 *
 * @author Jeff Lee
 */
public class PriceCalculator {

	public double calculate(double basePrice, int numWorkers, Markup type) {
		double finalPrice;

		if (basePrice < 0 || numWorkers < 0) {
			throw new IllegalArgumentException("Argument basePrice and numWorkers should not be less than 0");
		}

		finalPrice = basePrice * (1 + Markup.FLAT.markup());

		finalPrice *= (1 + numWorkers * Markup.WORKER.markup() + type.markup());

		return (double) Math.round(finalPrice * 100) / 100;
	}
}