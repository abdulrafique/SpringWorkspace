package com.application.bl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ConfigureBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDef=beanFactory.getBeanDefinition("class10");
		
		System.out.println("Bean Factory Post Processor: "+beanDef.getBeanClassName());
		
		beanDef.getPropertyValues().add("className", "Melbourne");
        List<String> nations=new ArrayList<String>();
        nations.add("India");
        nations.add("Australia");
        beanDef.getPropertyValues().add("nations", nations);
	}

}
