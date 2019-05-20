package com.demo.instancemethodref;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstanceMethodRef2 {

	private static final Logger log = LoggerFactory.getLogger(InstanceMethodRef2.class);
	public static void main(String[] args) {
		log.info("start");
		
		Thread thread = new Thread(new InstanceMethodRef2()::print);
		thread.start();

	}
	
	public void print() {
		log.info("from instance method....");
	}

}
