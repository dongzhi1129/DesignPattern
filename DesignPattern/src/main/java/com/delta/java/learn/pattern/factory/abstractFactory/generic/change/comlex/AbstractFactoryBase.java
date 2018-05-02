package com.delta.java.learn.pattern.factory.abstractFactory.generic.change.comlex;

public abstract class AbstractFactoryBase<T> implements IAbstractFactoryWithMapper<T> {

	protected AbstractMapperBase abstractMapperBase;

	public T createObject(Class<T> t) throws Exception {
		// TODO Auto-generated method stub
		if (t == null) {
			throw new IllegalArgumentException();
		}
		Class<T> type = (Class<T>) abstractMapperBase.get(t);
		return type.newInstance();
	}

	public void setAbstractMapperBase(AbstractMapperBase abstractMapperBase) {
		// TODO Auto-generated method stub
		this.abstractMapperBase = abstractMapperBase;

	}

	public AbstractMapperBase getAbstractMapperBase() {
		// TODO Auto-generated method stub
		return this.abstractMapperBase;

	}

}
