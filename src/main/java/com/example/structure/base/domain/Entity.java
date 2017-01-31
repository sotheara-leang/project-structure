package com.example.structure.base.domain;

public class Entity<ID> implements Identifiable<ID> {

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
