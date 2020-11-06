package org.javacream.duplicate_observed_data;

public class DemoBusinessObject {
	private String stringData;
	private String intData;
	public String getStringData() {
		return stringData;
	}
	public void setStringData(String stringData) {
		this.stringData = stringData;
	}
	public String getIntData() {
		return intData;
	}
	public void setIntData(String intData) {
		this.intData = intData;
	}

	public void saveState(){
		//Saves data to database
	}
	public void loadState(){
		//Load data from database
	}
}
