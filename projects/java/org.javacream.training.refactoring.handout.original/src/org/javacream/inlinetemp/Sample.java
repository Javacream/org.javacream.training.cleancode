package org.javacream.inlinetemp;

public class Sample {

	public double perimeter(double radius){
		return 2*Math.PI*radius;
	}
	public void printPerimter(double radius){
		double  perimeter = perimeter(radius);
		System.out.println(perimeter);
	}
}
