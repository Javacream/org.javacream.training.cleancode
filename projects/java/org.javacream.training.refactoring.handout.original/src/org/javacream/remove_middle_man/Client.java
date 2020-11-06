package org.javacream.remove_middle_man;

public class Client {

	private Person person;
	
	public Person getManager(){
		return person.getManager();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
