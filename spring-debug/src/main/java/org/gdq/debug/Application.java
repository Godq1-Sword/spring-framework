package org.gdq.debug;


import org.gdq.custom.CustomBean;
import org.gdq.custom.CustomClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * @author gdq
 * @since 2021/9/4
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new CustomClassPathXmlApplicationContext("applicationContext.xml");
		CustomBean bean = applicationContext.getBean(CustomBean.class);
		System.out.println(bean);
		org.gdq.editor.CustomBean propertyEditor = applicationContext.getBean(org.gdq.editor.CustomBean.class);
		System.out.println(propertyEditor);
	}
}
