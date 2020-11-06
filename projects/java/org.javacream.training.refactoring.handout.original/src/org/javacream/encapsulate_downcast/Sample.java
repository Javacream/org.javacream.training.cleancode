package org.javacream.encapsulate_downcast;

import java.util.List;

public class Sample {

	Object readFromList(List<Object> list){
		return list.get(0);
	}

	void printInfo(List<Object> list){
		String info = (String)readFromList(list);
		System.out.println(info);
	}

}
