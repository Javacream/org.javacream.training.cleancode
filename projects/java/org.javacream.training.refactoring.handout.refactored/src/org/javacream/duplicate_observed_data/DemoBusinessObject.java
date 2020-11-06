package org.javacream.duplicate_observed_data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DemoBusinessObject implements PropertyChangeListener{
	private String stringData;
	private int intData;
	public String getStringData() {
		return stringData;
	}
	public void setStringData(String stringData) {
		this.stringData = stringData;
	}
	public int getIntData() {
		return intData;
	}
	public void setIntData(int intData) {
		this.intData = intData;
	}

	public void saveState(){
		//Saves data to database
	}
	public void loadState(){
		//Load data from database
	}
	@Override
	public void propertyChange(PropertyChangeEvent changeEvent) {
		String propertyName = changeEvent.getPropertyName();
		if ("stringData".equals(propertyName)){
			setStringData((String) changeEvent.getNewValue());
		}else if ("intData".equals(propertyName)){
			setIntData((Integer) changeEvent.getNewValue());
		}
	}
}
