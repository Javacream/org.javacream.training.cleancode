package org.javacream.extract_interface;

public abstract class ContainerDecoratorUtil {

	public static Object get(Object o){
		if (o instanceof ContainerDecorator){
			return ((ContainerDecorator)o).getDecoratedObject();
		}else{
			return o;
		}
	}
}
