/**
 * PriceCalculator.java
 *
 * Written By: Jeff Lee
 * Created On: 2013/11/12
 */
package com.nulogy.nupack;

import com.nulogy.rounder.Rounder;
import com.nulogy.rounder.RoundingToNearestCent;


/**
 *
 * @author Jeff Lee
 */
public class PriceCalculator {

	private Rounder rounder;

	/**
	 *
	 */
	public PriceCalculator() {
		rounder = new RoundingToNearestCent();
	}

	/**
	 *
	 * @param rounder
	 */
	public PriceCalculator(Rounder rounder) {
		this.rounder = rounder;
	}

	/**
	 * Calculates the prices after different markup
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

		return rounder.round(finalPrice);
	}

	/**
	 * Calculates the multiply factor for flat markup
	 *
	 * @return  The multiply factor with flatMarkup
	 */
	protected double flatMarkup() {
		return 1 + Markup.FLAT.markup();
	}

	/**
	 * Calculates the multiply factor for all other markups combined
	 *
	 * @param numWorkers
	 * @param type
	 * @return  The Multiply factor with number of workers markup and the materials type markup
	 */
	protected double otherMarkup(int numWorkers, Markup type) {
		return 1 + numWorkers * Markup.WORKER.markup() + type.markup();
	}
}
