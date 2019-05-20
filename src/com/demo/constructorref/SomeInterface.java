package com.demo.constructorref;

@FunctionalInterface
public interface SomeInterface {
	void say(String msg);
}

@FunctionalInterface
interface AnotherInterface extends SomeInterface {
	void say(String z);
}
