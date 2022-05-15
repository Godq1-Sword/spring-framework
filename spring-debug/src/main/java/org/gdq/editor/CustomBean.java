package org.gdq.editor;

/**
 * @author gdq
 * @since 2021/10/18
 */
public class CustomBean {
	private CustomProperty customProperty;

	public CustomProperty getCustomProperty() {
		return customProperty;
	}

	public void setCustomProperty(CustomProperty customProperty) {
		this.customProperty = customProperty;
	}

	@Override
	public String toString() {
		return "CustomBean{" +
				"customProperty=" + customProperty +
				'}';
	}
}
