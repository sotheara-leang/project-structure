package com.example.structure.constant;

import com.example.structure.base.exception.BusinessError;

public enum ErrorCode implements BusinessError<ErrorCode> {
	
	ROL100,
	USR100;
	
	@Override
	public ErrorCode getCode() {
		return this;
	}

	@Override
	public String getMessageCode() {
		return name();
	}
}
