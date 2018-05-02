package com.delta.java.learn.pattern.factory.abstractFactory.generic.change.comlex;

import java.util.Set;

import com.delta.java.learn.pattern.factory.abstractFactory.generic.IColor;
import com.delta.java.learn.pattern.factory.abstractFactory.generic.RedColor;

public class ConcreatColorMapper extends AbstractMapperBase<Class<IColor>, Class<RedColor>> {

	@Override
	public Set<Entry<Class<IColor>, Class<RedColor>>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConcreatColorMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
