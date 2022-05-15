package org.gdq.custom;

/**
 * @author gdq
 * @since 2021/10/17
 */
public class CustomBean {

	private String id;

	private String name;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomBean{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
