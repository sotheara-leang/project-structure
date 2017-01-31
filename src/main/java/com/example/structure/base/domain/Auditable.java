package com.example.structure.base.domain;

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
