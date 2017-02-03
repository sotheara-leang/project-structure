package com.example.structure.frmk.web.message.error;

import org.springframework.http.HttpStatus;

import com.example.structure.frmk.exception.ErrorCode;

public class ErrorMessageBuilder {

	private ErrorMessage errorMessage = new ErrorMessage();

	public ErrorMessageBuilder code(ErrorCode<?> code) {
		errorMessage.setCode(code);
		return this;
	};
	
	public ErrorMessageBuilder status(HttpStatus status) {
		errorMessage.setStatus(status);
		return this;
	};
	
	public ErrorMessageBuilder message(String message) {
		errorMessage.setMessage(message);
		return this;
	};
	
	public ErrorMessage build() {
		return errorMessage;
	}
}
