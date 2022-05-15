package org.gdq.custom;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gdq
 * @since 2022/2/3
 */
public class CustomClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	// 构造方法
	public CustomClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
		super.initPropertySources();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		System.out.println("扩展customizeBeanFactory");
		beanFactory.setAllowBeanDefinitionOverriding(false);
		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("扩展postProcessBeanFactory");
		super.postProcessBeanFactory(beanFactory);
	}
}
