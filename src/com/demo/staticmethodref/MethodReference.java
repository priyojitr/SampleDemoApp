package com.demo.staticmethodref;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodReference {
	
	interface Interfaceable {
		void callStatic();
	}

	private static final Logger log = LoggerFactory.getLogger(MethodReference.class);
	
	public static void staticDefined() {
		log.info("static method definition");
	}
	
	public static void main(String[] ar) {
		log.info("start");
		Interfaceable obj = MethodReference::staticDefined;
		obj.callStatic();
	}
}
