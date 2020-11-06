package org.javacream.replace_magical_number;

public class Sample {
	public static final double GRAVITATIONAL_CONSTANT = 9.81;
	public double potentialEnergy(double mass, double height){
		return mass * height * GRAVITATIONAL_CONSTANT;
	}
}
