package com.delta.java.learn.pattern.factory.abstractFactory.generic.change.comlex;

import java.util.HashMap;
import java.util.Set;

public class AbstractDictionaryBase<K,V extends AbstractMapperBase> extends HashMap<K, V>{

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	



}
