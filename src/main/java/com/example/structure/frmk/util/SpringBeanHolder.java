package com.example.structure.frmk.util;

import java.util.Properties;

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
	
	public static <T> Object getBean(Class<T> clazz) {
		return appContext.getBean(clazz);
	}
	
	public static <T> Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}
	
	public static Properties getProperties(String beanName) {
		return appContext.getBean(beanName, Properties.class);
	}
}
