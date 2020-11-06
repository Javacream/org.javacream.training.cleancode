package org.javacream.replace_inheritance_with_delegation;

import java.util.Vector;

public class MyStack<E> {

	private Vector<E> delegate;

	{
		delegate = new Vector<E>();
	}

	public void push(E element) {
		delegate.insertElementAt(element, 0);
	}

	public E pop() {
		E result = delegate.firstElement();
		delegate.removeElementAt(0);
		return result;
	}

}
