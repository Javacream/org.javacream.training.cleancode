package org.javacream.remove_control_flag;

public class Sample {
	void checkSecurity(String[] people) {
		boolean found = false;
		for (int i = 0; i < people.length; i++) {
			if (!found) {
				if (people[i].equals("Don")) {
					sendAlert();
					found = true;
				}
				if (people[i].equals("John")) {
					sendAlert();
					found = true;
				}
			}
		}
	}

	private void sendAlert() {
		// sends alert

	}

}
