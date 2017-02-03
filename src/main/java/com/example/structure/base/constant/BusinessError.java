package com.example.structure.base.constant;

import com.example.structure.frmk.exception.ErrorCode;

public enum BusinessError implements ErrorCode<BusinessError> {
	
	ROL100,
	USR100;
	
	@Override
	public BusinessError getCode() {
		return this;
	}

	@Override
	public String getMessageCode() {
		return name();
	}
}
