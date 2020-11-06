package org.javacream.replace_inheritance_with_delegation;

import java.util.Vector;

public class MyStack<E> extends Vector<E> {

	private static final long serialVersionUID = 1L;

	public void push(E element) {
		insertElementAt(element, 0);
	}

	public E pop() {
		E result = firstElement();
		removeElementAt(0);
		return result;
	}

}
