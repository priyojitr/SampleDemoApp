package com.demo.instancemethodref;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Interfaceable {
	void say();
}

public class InstanceMethodRef {

	private static final Logger log = LoggerFactory.getLogger(InstanceMethodRef.class);
	
	public static void main(String[] args) {
		log.info("start");
		InstanceMethodRef obj = new InstanceMethodRef();
		
		Interfaceable interfaceable = obj::saySome;
		interfaceable.say();
		
		Interfaceable fn = new InstanceMethodRef()::sayAny; 
		fn.say();
	}
	
	public void saySome() {
		log.info("say something...");
	}
	
	public void sayAny() {
		log.info("saying anonymously!!");
	}

}
