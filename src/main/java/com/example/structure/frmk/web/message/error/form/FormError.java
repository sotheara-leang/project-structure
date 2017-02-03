package com.example.structure.frmk.web.message.error.form;

import java.util.Collections;
import java.util.List;

import com.example.structure.frmk.web.WebErorCode;
import com.example.structure.frmk.web.message.error.ErrorMessage;

public class FormError extends ErrorMessage {

	public FormError() {
		setCode(WebErorCode.REQ400);
	}
	
	public FormError(List<FieldError> errors) {
		this();
		this.errors = errors;
	}
	
	List<FieldError> errors = Collections.emptyList();

	public List<FieldError> getErrors() {
		return errors;
	}

	public void setErrors(List<FieldError> errors) {
		this.errors = errors;
	}
}
