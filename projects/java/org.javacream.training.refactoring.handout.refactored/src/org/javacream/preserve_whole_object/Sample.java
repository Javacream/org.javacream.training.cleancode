package org.javacream.preserve_whole_object;

import java.awt.Point;

public class Sample {

	double length(Point point) {
		return Math.sqrt(point.x * point.x + point.y * point.y);
	}

	public void doCaculation(Point point){
		System.out.println(length(point));
	}
}
