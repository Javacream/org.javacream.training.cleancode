package org.javacream.self_encapsulating_field;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SampleModel {

	private PropertyChangeSupport support;
	{
		support = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}

	private int data;

	public void doThis() {
		// ...
		setData(getData() + 1);
	}

	public void doThat() {
		// ...
		setData(getData() - 1);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		int oldData = data;
		this.data = data;
		support.firePropertyChange(new PropertyChangeEvent(this, "data", oldData, data));
		
	}
}
