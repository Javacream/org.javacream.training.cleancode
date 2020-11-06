package org.javacream.extract_interface;

public class CompanyAddressableDecorator2 implements Addressable, ContainerDecorator {

	private Company company;
	
	
	public String getAddress() {
		return company.getAddress();
	}


	public void setAddress(String address) {
		company.setAddress(address);
	}


	public CompanyAddressableDecorator2(Company company) {
		super();
		this.company = company;
	}


	@Override
	public Object getDecoratedObject() {
		return company;
	}


}
