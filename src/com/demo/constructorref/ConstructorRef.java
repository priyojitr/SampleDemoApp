package com.demo.constructorref;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Messageable {
	Message getMsg(String msg);
}

class Message{
	private static final Logger log = LoggerFactory.getLogger(ConstructorRef.class);
	Message(String msg) {
		log.info("{} from --> {}", msg, this.getClass().getName());
	}
}

public class ConstructorRef {
	private static final Logger log = LoggerFactory.getLogger(ConstructorRef.class);
	public static void main(String[] args) {
		log.info("start");
		Messageable msgable = Message::new;
		msgable.getMsg("hiii");
	}
}
