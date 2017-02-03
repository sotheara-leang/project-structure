package com.example.structure.frmk.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.MessageSourceAccessor;

public class SpringBeanHolder implements ApplicationContextAware {
	
	private static ApplicationContext appContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringBeanHolder.appContext = applicationContext;
	}
	
	public static ApplicationContext getAppContext() {
		return appContext;
	}
	
	public static MessageSourceAccessor getMessageSourceAccessor() {
		return appContext.getBean(MessageSourceAccessor.class);
	}
}
