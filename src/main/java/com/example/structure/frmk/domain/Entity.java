package com.example.structure.frmk.domain;

public abstract class Entity<ID> implements Identifiable<ID> {

	private ID id;
	
	@Override
	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public ID getId() {
		return id;
	}
}
