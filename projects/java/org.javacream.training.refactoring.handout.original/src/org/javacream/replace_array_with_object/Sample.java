package org.javacream.replace_array_with_object;

public class Sample {

	public void doSample(){
		String[] address = new String[2];
		address[0] = "München";
		address[1] = "Alois-Gilg-Weg";
		printAddress(address);
	}
	
	private void printAddress(String[] address){
		System.out.println("City: " + address[0] +", street: " + address[1]);
	}
}
