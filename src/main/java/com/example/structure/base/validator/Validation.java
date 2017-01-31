package com.example.structure.base.validator;

public interface Validation {

	static interface Default extends javax.validation.groups.Default {}
	
	static interface Create extends Default {}
	static interface Read  	extends Default {}
	static interface Update extends Default {}
	static interface Delete extends Default {}
}
