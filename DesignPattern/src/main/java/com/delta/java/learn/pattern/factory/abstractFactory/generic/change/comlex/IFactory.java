package com.delta.java.learn.pattern.factory.abstractFactory.generic.change.comlex;

public interface IFactory<T> {

	T createObject(Class<T> t);
}
