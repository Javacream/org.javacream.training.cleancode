package org.javacream.extract_superclass;

public abstract class Party {

	protected Party(String name){
		this.name = name;
	}
	private String name;

	public String getName() {
	    return name;
	}
	

}
