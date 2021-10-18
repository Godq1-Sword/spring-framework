package org.gdq.debug;


import org.gdq.custom.CustomTag;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gdq
 * @since 2021/9/4
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomTag bean = applicationContext.getBean(CustomTag.class);
		System.out.println(bean);
	}
}
