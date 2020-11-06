package org.javacream.extract_superclass;

public class Employee extends Party{
	private int annualCost;
	private String id;

	public Employee (String name, String id, int annualCost) {
	    super(name);
	    this.id = id;
	    this.annualCost = annualCost;
	}
	public int getAnnualCost() {
	    return annualCost;
	}
	public String getId(){
	    return id;
	}

}
