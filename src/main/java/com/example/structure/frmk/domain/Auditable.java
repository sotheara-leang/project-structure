package com.example.structure.frmk.domain;

import java.util.Date;

public interface Auditable<ID, Auditor extends Identifiable<ID>> extends Identifiable<ID> {

	void setCreateDate(Date createDate);

	Date getCreateDate();
	
	void setCreator(Auditor creator);
	
	Auditor getCreator();
	
	ID getCreatorId();
	
	void setUpdateDate(Date updateDate);
	
	Date getUpdateDate();
	
	void setUpdater(Auditor updater);
	
	Auditor getUpdater();
	
	ID getUpdaterId();
}
