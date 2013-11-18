
package com.nulogy.rounder;

/**
 *
 * @author Jeff Lee
 */
public class RoundingToNearestNickel implements Rounder {

	@Override
	public double round(double amount) {
		return Math.round(amount * 20) / 20.0;
	}

}
