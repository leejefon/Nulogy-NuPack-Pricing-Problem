/*
 * Markup.java
 *
 * Written By: Jeff Lee
 * Created On: 2013/11/12
 */
package com.nulogy.nupack;


/**
 *
 * @author Jeff Lee
 */
public enum Markup {

	FLAT(1, 0.05),
	WORKER(2, 0.012),
	PHARMACEUTICAL(3, 0.075),
	FOOD(4, 0.13),
	ELECTRONICS(5, 0.02),
	ELSE(6, 0);

	private final int id;
	private final double markup;

	Markup(int id, double markup) {
		this.id = id;
		this.markup = markup;
	}

	double markup() {
		return markup;
	}
}
