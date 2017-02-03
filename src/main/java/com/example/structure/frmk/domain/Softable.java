package com.example.structure.frmk.domain;

import java.util.Date;

public interface Softable<ID, Auditor extends Identifiable<ID>> extends Auditable<ID, Auditor> {

	void setDeleteDate(Date deleteDate);

	Date getDeleteDate();
	
	void setDeleter(Auditor creator);
	
	Auditor getDeleter();
	
	ID getDeleterId();
}
