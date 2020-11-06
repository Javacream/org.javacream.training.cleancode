package org.javacream.encapsulate_downcast;

import java.util.List;

public class Sample {

	String readFromList(List<Object> list){
		return (String)list.get(0);
	}

	void printInfo(List<Object> list){
		String info = readFromList(list);
		System.out.println(info);
	}

}
