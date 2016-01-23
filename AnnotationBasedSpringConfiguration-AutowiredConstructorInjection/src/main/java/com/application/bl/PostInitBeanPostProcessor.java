/**
 * 
 */
package com.application.bl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author abdulr02
 *
 */
public class PostInitBeanPostProcessor implements BeanPostProcessor,Ordered{

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Before Initialization: PostInitBeanPostProcessor::"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("After Initialization: PostInitBeanPostProcessor::"+beanName);
		return bean;
	}

}
