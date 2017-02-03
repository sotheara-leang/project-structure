package com.example.structure.frmk.tool.mybatis;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.defaults.DefaultSqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSession.StrictMap;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.structure.frmk.domain.Auditable;
import com.example.structure.frmk.domain.Identifiable;

/**
 * 
 * @author sotheara.leang
 *
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class AuditorInterceptor<ID, Auditor extends Identifiable<ID>> implements Interceptor {
	
	private AuditHandler<ID, Auditor> auditHandler;
	
	@Autowired
	public AuditorInterceptor(AuditHandler<ID, Auditor> auditHandler) {
		this.auditHandler = auditHandler;
	}
	
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}
	
	public void setProperties(Properties properties) {}
	
	@SuppressWarnings("unchecked")
	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement stmt = (MappedStatement) invocation.getArgs()[0];
		Object object = invocation.getArgs()[1];
		
		SqlCommandType sqlCommandType = stmt.getSqlCommandType();
		
		if (object instanceof DefaultSqlSession.StrictMap<?>) {
			StrictMap<?> map = (StrictMap<?>) object;
			List<Object> list = (List<Object>) map.get("list");
			
			initFieldWithList(sqlCommandType, list);
			
		} else {
			initField(sqlCommandType, (Auditable<?, ?>) object);
		}

		return invocation.proceed();
	}
	
	public void initFieldWithList(SqlCommandType action, List<Object> list) {
		for (Object object : list) {
			initField(action, object);
		}
	}
	
	public void initField(SqlCommandType action, Object object) {
		switch (action) {
		case INSERT: auditHandler.beforeCreate(object); break;
		case UPDATE: auditHandler.beforeUpdate(object); break;
		case DELETE: auditHandler.beforeDelete(object); break;
		default: break;
		}
	}
}
