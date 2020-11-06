package org.javacream.substitute_algorithm;

import java.util.Arrays;
import java.util.List;

public class Sample {
	public String foundPerson(String[] people) {
		List<String> candidates = Arrays.asList(new String[] { "John", "Paul",
				"George", "Ringo" });
		for (int i = 0; i < people.length; i++)
			if (candidates.contains(people[i]))
				return people[i];
		return "";
	}

}
