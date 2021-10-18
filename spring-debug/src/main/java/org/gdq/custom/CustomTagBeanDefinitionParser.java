package org.gdq.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author gdq
 * @since 2021/10/14
 */
public class CustomTagBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return CustomTag.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String name = element.getAttribute("name");
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name", name);
		}
	}
}
