package org.javacream.split_temporary_variable;

public class Sample {

	public void printAreas(double size){
		double area = size*size*Math.PI;
		System.out.println("Circle: " + area);
		area = 4*size*size;
		System.out.println("Box: " + area);
		
	}
}
