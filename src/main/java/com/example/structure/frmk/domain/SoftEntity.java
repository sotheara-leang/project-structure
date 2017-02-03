package com.example.structure.frmk.domain;

import java.util.Date;

public abstract class SoftEntity<ID, Auditor extends Identifiable<ID>> extends AuditEntity<ID, Auditor> implements Softable<ID, Auditor> {

	private Date deleteDate;
	private Auditor deleter;
	
	@Override
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public Date getDeleteDate() {
		return deleteDate;
	}

	@Override
	public void setDeleter(Auditor deleter) {
		this.deleter = deleter;
	}

	@Override
	public Auditor getDeleter() {
		return deleter;
	}

	@Override
	public ID getDeleterId() {
		return deleter == null ? null : deleter.getId();
	}

}
