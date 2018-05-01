package com.delta.java.learn.pattern.factory.abstractFactory.generic.change;

public interface AbstractFactory<T> {

	T createObject(Class<T> t) throws Exception;

}
