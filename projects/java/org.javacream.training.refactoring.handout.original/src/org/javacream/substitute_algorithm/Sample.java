package org.javacream.substitute_algorithm;

public class Sample {
	public String foundPerson(String[] people){
	    for (int i = 0; i < people.length; i++) {
	        if (people[i].equals ("John")){
	            return "John";
	        }
	        if (people[i].equals ("Paul")){
	            return "Paul";
	        }
	        if (people[i].equals ("George")){
	            return "George";
	        }
	        if (people[i].equals ("Ringo")){
	            return "Ringo";
	        }
	    }
	    return "";
	}

}
