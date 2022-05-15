package org.gdq.editor;

/**
 * @author gdq
 * @since 2021/10/18
 */
public class CustomProperty {
	private String arg0;
	private String arg1;

	public String getArg0() {
		return arg0;
	}

	public void setArg0(String arg0) {
		this.arg0 = arg0;
	}

	public String getArg1() {
		return arg1;
	}

	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}

	@Override
	public String toString() {
		return "CustomProperty{" +
				"arg0='" + arg0 + '\'' +
				", arg1='" + arg1 + '\'' +
				'}';
	}
}

