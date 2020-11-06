package org.javacream.encapsulate_collection;

import java.util.Collections;
import java.util.List;

public class Sample {

	private List<String> elements;

	public List<String> getElements() {
		return Collections.unmodifiableList(elements);
	}

	public void addElement(String element){
		if (checkElement(element)){
			elements.add(element);
		}
	}
	public void removeElement(String element){
		if (checkElement(element)){
			elements.remove(element);
		}
	}
	
	

	private boolean checkElement(String element) {
		//Implement validation
		return true;
	}
	
}
