package org.javacream.util.decorators;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TracingDecorator implements InvocationHandler {

	private Object delegate;

	public void setDelegate(Object delegate) {
		this.delegate = delegate;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		System.out.println("entering " + methodName);
		try {
			Object result = method.invoke(delegate, args);
			System.out.println("returning from " + methodName);
			return result;
		} catch (Throwable t) {
			if (t instanceof InvocationTargetException)
				t = ((InvocationTargetException) t).getTargetException();
			System.out.println("throwing from " + methodName);
			throw t;

		}
	}

	public static <T> T decorate(Class<T> toImplement, Object toDecorate) {
		TracingDecorator tracingDecorator = new TracingDecorator();
		tracingDecorator.setDelegate(toDecorate);
		ClassLoader classLoader = TracingDecorator.class.getClassLoader();
		Class<?>[] interfaces = { toImplement };
		return toImplement.cast(Proxy.newProxyInstance(classLoader, interfaces, tracingDecorator));
	}
}
