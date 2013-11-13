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

	/**
	 *
	 * @param basePrice
	 * @param numWorkers
	 * @param type
	 * @return
	 */
	public double calculate(double basePrice, int numWorkers, Markup type) {
		double finalPrice;

		if (basePrice < 0 || numWorkers < 0) {
			throw new IllegalArgumentException("Argument basePrice and numWorkers should not be less than 0");
		}

		finalPrice = basePrice * flatMarkup() * otherMarkup(numWorkers, type);

		return (double) Math.round(finalPrice * 100) / 100;
	}

	/**
	 *
	 * @return  The multiply factor with flatMarkup
	 */
	protected double flatMarkup() {
		return 1 + Markup.FLAT.markup();
	}

	/**
	 *
	 * @param numWorkers
	 * @param type
	 * @return  The Multiply factor with number of workers markup and the materials type markup
	 */
	protected double otherMarkup(int numWorkers, Markup type) {
		return 1 + numWorkers * Markup.WORKER.markup() + type.markup();
	}
}
