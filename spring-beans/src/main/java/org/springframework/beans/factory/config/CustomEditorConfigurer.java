/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.core.Ordered;
import org.springframework.lang.Nullable;

import java.beans.PropertyEditor;
import java.util.Map;

public class CustomEditorConfigurer implements BeanFactoryPostProcessor, Ordered {

	protected final Log logger = LogFactory.getLog(getClass());

	private int order = Ordered.LOWEST_PRECEDENCE;  // default: same as non-Ordered

	@Nullable
	private PropertyEditorRegistrar[] propertyEditorRegistrars;

	@Nullable
	private Map<Class<?>, Class<? extends PropertyEditor>> customEditors;


	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int getOrder() {
		return this.order;
	}

	/**
	 * Specify the {@link PropertyEditorRegistrar PropertyEditorRegistrars}
	 * to apply to beans defined within the current application context.
	 * <p>This allows for sharing {@code PropertyEditorRegistrars} with
	 * {@link org.springframework.validation.DataBinder DataBinders}, etc.
	 * Furthermore, it avoids the need for synchronization on custom editors:
	 * A {@code PropertyEditorRegistrar} will always create fresh editor
	 * instances for each bean creation attempt.
	 *
	 * @see ConfigurableListableBeanFactory#addPropertyEditorRegistrar
	 */
	public void setPropertyEditorRegistrars(PropertyEditorRegistrar[] propertyEditorRegistrars) {
		this.propertyEditorRegistrars = propertyEditorRegistrars;
	}

	/**
	 * Specify the custom editors to register via a {@link Map}, using the
	 * class name of the required type as the key and the class name of the
	 * associated {@link PropertyEditor} as value.
	 *
	 * @see ConfigurableListableBeanFactory#registerCustomEditor
	 */
	public void setCustomEditors(Map<Class<?>, Class<? extends PropertyEditor>> customEditors) {
		this.customEditors = customEditors;
	}


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		if (this.propertyEditorRegistrars != null) {
			for (PropertyEditorRegistrar propertyEditorRegistrar : this.propertyEditorRegistrars) {
				beanFactory.addPropertyEditorRegistrar(propertyEditorRegistrar);
			}
		}
		if (this.customEditors != null) {
			this.customEditors.forEach(beanFactory::registerCustomEditor);
		}
	}

}
