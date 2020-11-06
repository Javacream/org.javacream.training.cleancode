package org.javacream.introduce_explaining_variable;

public class Sample {

	public void checkSystem() {
		//check if application runs on Windows XP
		if (System.getProperty("os.name").toUpperCase().indexOf("Windows") > -1
				&& System.getProperty("os.version").startsWith("5")) {
			// applyWindowsPatch();
		}
	}
}
