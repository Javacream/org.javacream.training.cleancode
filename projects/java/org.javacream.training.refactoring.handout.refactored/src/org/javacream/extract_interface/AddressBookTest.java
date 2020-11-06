package org.javacream.extract_interface;

import org.junit.Test;

public class AddressBookTest {
	@Test public void testAddressBook(){
		
		final String ADDRESS_1 = "Bahnhofstrasse 1,Aachen";
		final String ADDRESS_2 = "Bahnhofstrasse 2,Aachen";
		final String ADDRESS_3 = "Bahnhofstrasse 3,Aachen";
		final String ADDRESS_4 = "Bahnhofstrasse 4,Aachen";
		AddressBook addressBook = new AddressBook();
		Person person = new Person();
		person.setAddress(ADDRESS_1);
		person.setLastname("Sawitzki");
		person.setFirstname("Rainer");
		
		Hotel hotel = new Hotel();
		hotel.setName("Park Inn");
		hotel.setAddress(ADDRESS_2);
		
		CompanyAddressableDecorator companyAddressableDecorator = new CompanyAddressableDecorator();
		companyAddressableDecorator.setName("Generali");
		companyAddressableDecorator.setAddress(ADDRESS_3);
		
		SchoolAddressableDecorator schoolAddressableDecorator = new SchoolAddressableDecorator();
		schoolAddressableDecorator.setName("Gymnasium");
		schoolAddressableDecorator.setAddress(ADDRESS_4);
		
		addressBook.addAddressable(person);
		addressBook.addAddressable(hotel);
		addressBook.addAddressable(schoolAddressableDecorator);
		addressBook.addAddressable(companyAddressableDecorator);
		
		System.out.println(addressBook.get(ADDRESS_1));
		System.out.println(addressBook.get(ADDRESS_2));
		System.out.println(addressBook.get(ADDRESS_3));
		System.out.println(addressBook.get(ADDRESS_4));
		
		
	}

}
