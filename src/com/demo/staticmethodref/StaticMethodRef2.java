package com.demo.staticmethodref;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticMethodRef2 {

	private static final Logger log = LoggerFactory.getLogger(StaticMethodRef2.class);

	public static void main(String[] args) {
		log.info("start");

		// referring to run method of Runnable functional interface using method
		// reference
		Thread thread = new Thread(StaticMethodRef2::threadStatus);
		thread.start();

	}

	public static void threadStatus() {
		log.info("thread running");
	}

}
