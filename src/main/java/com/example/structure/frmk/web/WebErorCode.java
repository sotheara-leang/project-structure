package com.example.structure.frmk.web;

import com.example.structure.frmk.exception.ErrorCode;

public enum WebErorCode implements ErrorCode<WebErorCode>{
	
	SYS500,
	REQ400;

	@Override
	public String getMessageCode() {
		return name();
	}

	@Override
	public WebErorCode getCode() {
		return this;
	}
}
