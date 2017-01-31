package com.example.structure.base.exception;

import com.example.structure.base.util.MessageUtils;

/**
 * 
 * @author sotheara.leang
 *
 */
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2286155598349668301L;
	
	private BusinessError<?> error;

	public BusinessException(BusinessError<?> businessError) {
		super(MessageUtils.getMessage(businessError.getMessageCode()));
		this.error = businessError;
	}
	
	public BusinessException(BusinessError<?> businessError, String customMessage) {
		super(customMessage);
		this.error = businessError;
	}
	
	public BusinessException(BusinessError<?> businessError, Object[] args) {
		super(MessageUtils.getMessage(businessError.getMessageCode(), args));
		this.error = businessError;
	}

	public BusinessError<?> getError() {
		return error;
	}

	public void setError(BusinessError<?> error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "BusinessException [error=" + error + "]";
	}
}
