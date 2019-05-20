package com.demo.staticmethodref;

import java.util.function.IntBinaryOperator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticMethodRef3 {

	private static final Logger log = LoggerFactory.getLogger(StaticMethodRef3.class);

	public static void main(String[] args) {
		log.info("start");
		
		// in-built functional interface that accepts 2 int params & return int type
		IntBinaryOperator fn = StaticMethodRef3::add;
		final int result = fn.applyAsInt(10, 40);
		log.info("{}", result);
	}

	public static int add(int x, int y) {
		return x + y;
	}

}
