package org.javacream.extract_subclass;

public class Sample {
	public void doSample(){
		Worker al = new Worker();
		al.setLastname("Bundy");
		al.setSalary(Integer.MIN_VALUE);
		al.work();
		
		Person peggy = new Person();
		peggy.setLastname("Bundy");
		//not needed...
		//peggy.work();
	}

}
