package com.example.structure.base.util;

import org.springframework.context.support.MessageSourceAccessor;

public class MessageUtils {

	private static MessageSourceAccessor messageSourceAccessor = SpringBeanHolder.getMessageSourceAccessor();
	
	public static String getMessage(String messageCode) {
		return messageSourceAccessor.getMessage(messageCode);
	}
	
	public static String getMessage(String messageCode, Object[] args) {
		return messageSourceAccessor.getMessage(messageCode, args);
	}
}
