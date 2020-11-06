package org.javacream.replace_constructor_with_factory_method;

import java.util.Map;

public class Person {

	public static Person create(Map<String, Object> params) {
		if (params.get("university") != null) {
			return new Student();
		} else if (params.get("factory") != null) {
			return new Worker();
		} else {
			return new Person();
		}
	}
}
