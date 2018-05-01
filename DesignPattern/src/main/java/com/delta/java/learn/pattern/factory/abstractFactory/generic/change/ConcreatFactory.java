package com.delta.java.learn.pattern.factory.abstractFactory.generic.change;

import java.util.Map;

public class ConcreatFactory<T> extends AbstractFactoryBase<T> {

	public ConcreatFactory(Map<Class<?>, Class<?>> mapper) {
		super(mapper);
		// TODO Auto-generated constructor stub
	}

}
