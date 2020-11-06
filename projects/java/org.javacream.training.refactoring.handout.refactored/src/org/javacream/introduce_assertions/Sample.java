package org.javacream.introduce_assertions;

public class Sample {

	String state;
	
	public Sample(String state){
		this.state = state;
	}
	
	public int getLength(){
		assert(state != null);
		return state.length();
	}
}
