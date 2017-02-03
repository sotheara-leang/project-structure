package com.example.structure.frmk.tool.mybatis;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.structure.frmk.domain.Auditable;
import com.example.structure.frmk.domain.Identifiable;
import com.example.structure.frmk.domain.Softable;

public class AuditHandler<ID, Auditor extends Identifiable<ID>> {
	
	protected AuditorAware<Auditor> auditorAware;
	
	@Autowired
	public AuditHandler(AuditorAware<Auditor> auditorAware) {
		this.auditorAware = auditorAware;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void beforeCreate(Object object) {
		if (object instanceof Auditable) {
			Auditor auditor = auditorAware.getCurrentAuditor();
			
			Auditable target = (Auditable) object;
			target.setCreateDate(new Date());
			target.setCreator(auditor);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void beforeUpdate(Object object) {
		if (object instanceof Auditable) {
			Auditor auditor = auditorAware.getCurrentAuditor();
			
			Auditable target = (Auditable) object;
			target.setUpdateDate(new Date());
			target.setUpdater(auditor);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void beforeDelete(Object object) {
		if (object instanceof Softable) {
			Auditor auditor = auditorAware.getCurrentAuditor();
			
			Softable target = (Softable) object;
			target.setDeleteDate(new Date());
			target.setDeleter(auditor);
		}
	}
}
