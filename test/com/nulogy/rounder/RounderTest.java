
package com.nulogy.rounder;

import junit.framework.TestCase;


/**
 *
 * @author Jeff Lee
 */
public class RounderTest extends TestCase {

	private Rounder nickelRounder;

	public void setUp() {
		nickelRounder = new RoundingToNearestNickel();
	}

	public void testRoundingDownToNearest5Cent() {
		assertEquals(10.20, nickelRounder.round(10.22));
		assertEquals(10.25, nickelRounder.round(10.27));
	}

	public void testRoundingUpToNearest5Cent() {
		assertEquals(10.25, nickelRounder.round(10.23));
		assertEquals(10.30, nickelRounder.round(10.28));
	}

	public void testNoRoundingNeeded() {
		assertEquals(10.25, nickelRounder.round(10.25));
		assertEquals(10.30, nickelRounder.round(10.30));
	}

}
