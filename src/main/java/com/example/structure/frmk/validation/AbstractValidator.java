package com.example.structure.frmk.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;

public class AbstractValidator implements SmartValidator {

	private Validator validator;

	@Autowired
	public AbstractValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		validateJSR330(target, errors);
	}

	@Override
	public void validate(Object target, Errors errors, Object... validationHints) {
		validateJSR330(target, errors);
	}

	protected void validateJSR330(Object target, Errors errors) {
		if (validator != null) {
			Set<ConstraintViolation<Object>> constraintViolations = validator.validate(target);

			for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
				String propertyPath = constraintViolation.getPropertyPath().toString();
				String message = constraintViolation.getMessage();
				
				errors.rejectValue(propertyPath, "", message);
				
			}
		}
	}
}
