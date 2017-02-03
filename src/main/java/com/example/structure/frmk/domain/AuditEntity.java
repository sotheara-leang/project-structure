package com.example.structure.frmk.domain;

import java.util.Date;

public abstract class AuditEntity<ID, Auditor extends Identifiable<ID>> extends Entity<ID> implements Auditable<ID, Auditor> {

	private Date createDate;
	private Auditor creator;
	
	private Date updateDate;
	private Auditor updater;
	
	@Override
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public Date getCreateDate() {
		return createDate;
	}

	@Override
	public void setCreator(Auditor creator) {
		this.creator = creator;
	}

	@Override
	public Auditor getCreator() {
		return creator;
	}

	@Override
	public ID getCreatorId() {
		return creator == null ? null : creator.getId();
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public Date getUpdateDate() {
		return updateDate;
	}

	@Override
	public void setUpdater(Auditor updater) {
		this.updater = updater;
	}

	@Override
	public Auditor getUpdater() {
		return updater;
	}

	@Override
	public ID getUpdaterId() {
		return updater == null ? null : updater.getId();
	}
}
