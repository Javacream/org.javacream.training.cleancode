package org.javacream.separate_query_from_modifier;

public class Sample {

	String foundPerson(String[] people){
	    for (int i = 0; i < people.length; i++) {
	        if (people[i].equals ("Don")){
	           return "Don";
	        }
	        if (people[i].equals ("John")){
	           return "John";
	        }
	    }
	    return "";
	}

	void foundMiscreant (String[] people){
	    for (int i = 0; i < people.length; i++) {
	        if (people[i].equals ("Don")){
	           sendAlert();
	           return;
	        }
	        if (people[i].equals ("John")){
	           sendAlert();
	           return;
	        }
	    }
	}

	private void sendAlert() {
		// sending alert message
		
	}

}
