package org.gdq.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author gdq
 * @since 2021/10/18
 */
public class CustomNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("customBean", new CustomTagBeanDefinitionParser());
	}
}
