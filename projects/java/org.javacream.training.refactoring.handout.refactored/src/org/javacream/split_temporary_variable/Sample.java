package org.javacream.split_temporary_variable;

public class Sample {

	public void printAreas(double size){
		final double circleArea = size*size*Math.PI;
		System.out.println("Circle: " + circleArea);
		final double boxArea = 4*size*size;
		System.out.println("Box: " + boxArea);
	}
}
