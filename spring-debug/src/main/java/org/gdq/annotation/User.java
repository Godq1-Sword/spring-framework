package org.gdq.annotation;

import org.gdq.debug.ExampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author gdq
 * @since 2022/2/5
 */
@Component
public class User {

	@Autowired
	private ExampleBean exampleBean;

	public void setExampleBean(ExampleBean exampleBean) {
		this.exampleBean = exampleBean;
	}

	public ExampleBean getExampleBean() {
		return exampleBean;
	}
}
