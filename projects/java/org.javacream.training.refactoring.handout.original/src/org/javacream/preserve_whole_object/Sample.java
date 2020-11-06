package org.javacream.preserve_whole_object;

import java.awt.Point;

public class Sample {

	double length(int x, int y){
		return Math.sqrt(x*x + y*y);
	}
	
	public void doCaculation(Point point){
		System.out.println(length(point.x, point.y));
	}
}
