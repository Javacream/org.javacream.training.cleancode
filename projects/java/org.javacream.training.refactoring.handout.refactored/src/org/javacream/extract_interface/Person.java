package org.javacream.extract_interface;

public class Person implements Addressable {

	private String lastname, firstname;
	private String address;

	/* (non-Javadoc)
	 * @see org.javacream.extract_interface.Addressable#getAddress()
	 */
	public String getAddress() {
		return address;
	}

	/* (non-Javadoc)
	 * @see org.javacream.extract_interface.Addressable#setAddress(java.lang.String)
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}
	
	
}
