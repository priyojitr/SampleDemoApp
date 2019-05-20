package com.demo.instancemethodref;

import java.util.function.IntBinaryOperator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstanceMethodRef3 {

	private static final Logger log = LoggerFactory.getLogger(InstanceMethodRef3.class);

	public static void main(String[] args) {
		log.info("start");
		final int x = 10;
		final int y = 20;
		
		log.info("x-->{}, y -->{}", x, y);
		InstanceMethodRef3 obj = new InstanceMethodRef3();
		IntBinaryOperator addFn = obj::add;

		log.info("result using obj (add oprtn): {}", addFn.applyAsInt(x, y));
		
		IntBinaryOperator multiplyFn = new InstanceMethodRef3()::multiply;
		log.info("result using anonymous (product): {}", multiplyFn.applyAsInt(x, y));
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

}
