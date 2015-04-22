package com.cores.corePlatform.base.api.content;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContext implements ApplicationContextAware {

	private static ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationcontext)
			throws BeansException {
		SpringContext.context = applicationcontext;
	}

	public static Object getBean(String beanName) {
		if(context != null){
			return context.getBean(beanName);
		}
		return null;
	}

}
