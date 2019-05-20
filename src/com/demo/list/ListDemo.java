package com.demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public void printListValues() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
		Iterator<?> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		if(list.contains(9)) {
			System.out.println("present");
		} else {
			System.out.println("absent");
		}
	}
}
