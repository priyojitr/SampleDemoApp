package com.demo.manager;

import com.demo.pojo.SamplePojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SampleMgr {
	
	public void printJson() {
		String output = "";
		SamplePojo pojo = new SamplePojo();
		output = format(pojo);
		System.out.println(output);
	}
	
	private String format(Object obj) {
		String output = "";
		try {
			String className = obj.getClass().toString();
			Object x = Class.forName(className.split(" ")[1]).newInstance();
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			output = mapper.writeValueAsString(x);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return output;
	}

}
