package org.javacream.replace_delegation_with_inheritance;

public class Employee {
	private Person delegate;

	public String getName() {
		return delegate.getName();
	}

	public void setName(String name) {
		delegate.setName(name);
	}
	
	public void work(){
		
	}

}
