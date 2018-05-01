package com.delta.java.learn.pattern.factory.abstractFactory.generic.change;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import com.delta.java.learn.pattern.factory.abstractFactory.generic.IColor;
import com.delta.java.learn.pattern.factory.abstractFactory.generic.RedColor;

public class Test {
	
	public static void main(String[] args) {
		Map<Class<?>,Class<?>> mapper = new HashedMap();
		mapper.put(IColor.class, RedColor.class);
		AbstractFactory<IColor> abstractFactory = new ConcreatFactory<IColor>(mapper);
		try {
			IColor redColor = abstractFactory.createObject(IColor.class);
			redColor.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
