package org.gdq.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author gdq
 * @since 2021/10/18
 */
public class CustomPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split(",");
		CustomProperty customProperty = new CustomProperty();
		customProperty.setArg0(split[0]);
		customProperty.setArg1(split[1]);
		this.setValue(customProperty);
	}
}
