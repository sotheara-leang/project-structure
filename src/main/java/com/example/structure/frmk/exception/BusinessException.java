package com.example.structure.frmk.exception;

import com.example.structure.frmk.util.MessageUtils;

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
	
	private ErrorCode<?> error;

	public BusinessException(ErrorCode<?> businessError) {
		super(MessageUtils.getMessage(businessError.getMessageCode()));
		this.error = businessError;
	}
	
	public BusinessException(ErrorCode<?> businessError, String customMessage) {
		super(customMessage);
		this.error = businessError;
	}
	
	public BusinessException(ErrorCode<?> businessError, Object[] args) {
		super(MessageUtils.getMessage(businessError.getMessageCode(), args));
		this.error = businessError;
	}

	public ErrorCode<?> getError() {
		return error;
	}

	public void setError(ErrorCode<?> error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "BusinessException [error=" + error + "]";
	}
}
