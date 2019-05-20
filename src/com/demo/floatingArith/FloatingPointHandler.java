package com.demo.floatingArith;

import java.math.BigDecimal;

public class FloatingPointHandler {

	public void print() {
		BigDecimal x = new BigDecimal(13.42);
		BigDecimal y = new BigDecimal(8.57);
		
		double val = x.subtract(y).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(x.subtract(y).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("double - " +val);
	}
}
