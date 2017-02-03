package com.example.structure.frmk.domain;

public interface Identifiable<ID> {

	void setId(ID id);
	
	ID getId();
}
