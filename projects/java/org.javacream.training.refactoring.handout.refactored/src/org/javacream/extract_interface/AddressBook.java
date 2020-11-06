package org.javacream.extract_interface;

import java.util.HashMap;

public class AddressBook {

	private HashMap<String, Addressable> addressBook;
	
	{
		addressBook = new HashMap<String, Addressable>();
	}
	
	public void addAddressable(Addressable addressable){
		addressBook.put(addressable.getAddress(), addressable);
	}
	
	public Addressable get(String address){
		return (Addressable) ContainerDecoratorUtil.get(addressBook.get(address));
	}
}
