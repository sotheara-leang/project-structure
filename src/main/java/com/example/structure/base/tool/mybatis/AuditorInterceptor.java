package com.example.structure.base.tool.mybatis;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.defaults.DefaultSqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSession.StrictMap;

/**
 * 
 * @author sotheara.leang
 *
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class AuditorInterceptor implements Interceptor {
	
	@SuppressWarnings("unchecked")
	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement stmt = (MappedStatement) invocation.getArgs()[0];
		Object object = invocation.getArgs()[1];
		
		if (object instanceof DefaultSqlSession.StrictMap<?>) {
			StrictMap<?> map = (StrictMap<?>) object;
			List<Object> list = (List<Object>) map.get("list");
			
			initFieldWithList(stmt, list);
		} else {
			initField(stmt, object);
		}

		return invocation.proceed();
	}

	private void initField(MappedStatement stmt, Object object) {
		
	}

	private void initFieldWithList(MappedStatement stmt, List<Object> list) {
		
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {}
}
