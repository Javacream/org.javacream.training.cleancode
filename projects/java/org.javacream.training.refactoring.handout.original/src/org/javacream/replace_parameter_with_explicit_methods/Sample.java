package org.javacream.replace_parameter_with_explicit_methods;

public class Sample {

	int height;
	int width;

	void setValue(String name, int value) {
		if (name.equals("height"))
			height = value;
		if (name.equals("width"))
			width = value;
	}

}
