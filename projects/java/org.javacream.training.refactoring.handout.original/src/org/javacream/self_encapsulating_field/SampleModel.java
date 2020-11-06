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

	@SuppressWarnings("unused")
	private int data;

	public void doThis() {
		// ...
		data += 1;
		support.firePropertyChange(new PropertyChangeEvent(this, "data", null, null));
	}

	public void doThat() {
		// ...
		data -= 2;
		support.firePropertyChange(new PropertyChangeEvent(this, "data", null, null));
	}
}
