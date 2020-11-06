package org.javacream.introduce_explaining_variable;

public class Sample {

	public void checkSystem() {
		final boolean isWindows = System.getProperty("os.name").toUpperCase()
				.indexOf("Windows") > -1;
		final boolean isXp = System.getProperty("os.version").startsWith("5");
		if (isWindows && isXp) {
			// applyWindowsPatch();
		}
	}
}
