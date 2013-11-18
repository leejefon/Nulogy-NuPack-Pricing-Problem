
package com.nulogy.rounder;

/**
 *
 * @author Jeff Lee
 */
public class RoundingToNearestCent implements Rounder {

	@Override
	public double round(double amount) {
		return Math.round(amount * 100) / 100.0;
	}

}
