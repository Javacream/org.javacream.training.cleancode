package org.javacream.duplicate_observed_data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DemoPresentation {
	private PropertyChangeSupport propertyChangeSupport;
	
	{
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener){
		propertyChangeSupport.addPropertyChangeListener(listener);
	}
	public void removePropertyChangeListener(PropertyChangeListener listener){
		propertyChangeSupport.removePropertyChangeListener(listener);
	}
	
	int intData;
	String stringData;

	public void modifyData(int intData, String stringData){
		setIntData(intData);
		setStringData(stringData);
	}
	public String getStringData() {
		return stringData;
	}
	public void setStringData(String stringData) {
		PropertyChangeEvent changeEvent = new PropertyChangeEvent(this, "stringData", this.stringData, stringData);
		this.stringData = stringData;
		propertyChangeSupport.firePropertyChange(changeEvent);
	}
	public void setIntData(int intData) {
		PropertyChangeEvent changeEvent = new PropertyChangeEvent(this, "intData", this.intData, intData);
		this.intData = intData;
		propertyChangeSupport.firePropertyChange(changeEvent);
	}
	
}
