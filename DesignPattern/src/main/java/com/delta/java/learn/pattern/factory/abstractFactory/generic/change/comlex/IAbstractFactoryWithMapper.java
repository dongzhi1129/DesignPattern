package com.delta.java.learn.pattern.factory.abstractFactory.generic.change.comlex;

public interface  IAbstractFactoryWithMapper<T> extends IFactory<T> {
	
	void setAbstractMapperBase(AbstractMapperBase abstractMapperBase);
	
	AbstractMapperBase getAbstractMapperBase();

}
