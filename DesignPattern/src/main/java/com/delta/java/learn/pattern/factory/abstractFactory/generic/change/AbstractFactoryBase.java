package com.delta.java.learn.pattern.factory.abstractFactory.generic.change;

import java.util.Map;

public abstract class AbstractFactoryBase<T> implements AbstractFactory<T> {

	protected Map<Class<?>, Class<?>> mapper;

	public AbstractFactoryBase(Map<Class<?>, Class<?>> mapper) {
		this.mapper = mapper;
	}

	public T createObject(Class<T> t) throws Exception{
		// TODO Auto-generated method stub
		if(mapper == null || mapper.isEmpty() ||!mapper.containsKey(t)) {
			throw new IllegalArgumentException();
		}
		Class<?> targetClass = mapper.get(t);
		return (T) targetClass.newInstance();
	}

}
