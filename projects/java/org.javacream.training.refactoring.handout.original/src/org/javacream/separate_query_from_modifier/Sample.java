package org.javacream.separate_query_from_modifier;

public class Sample {

	String foundMiscreant(String[] people){
	    for (int i = 0; i < people.length; i++) {
	        if (people[i].equals ("Don")){
	           sendAlert();
	           return "Don";
	        }
	        if (people[i].equals ("John")){
	           sendAlert();
	           return "John";
	        }
	    }
	    return "";
	}

	private void sendAlert() {
		// sending alert message
		
	}

}
