package com.demo.parsing;

import lombok.ToString;

@ToString
public class ResponsePkt extends ResponseAddnPkt {
	
	private String fld3;
	private String fld4;

	public ResponsePkt() {
		this.fld3 = "child fld3";
		this.fld4 = "child fld4";
	}
	
}
