package com.dataflowdeveloper.processors.process;

public class PersonName {

	
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonName [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	public PersonName() {
		super();
	}

	/**
	 * @param name
	 */
	public PersonName(String name) {
		super();
		this.name = name;
	}

	
	
}
