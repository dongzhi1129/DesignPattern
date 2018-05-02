package com.delta.java.learn.pattern.factory.abstractFactory.generic.change.comlex;

import org.apache.commons.collections.map.HashedMap;

import com.delta.java.learn.pattern.factory.abstractFactory.generic.IColor;
import com.delta.java.learn.pattern.factory.abstractFactory.generic.RedColor;

public class Assembler {

	private static AbstractDictionaryBase<Class<?>,AbstractMapperBase> abstractDictionaryBase = new AbstractDictionaryBase();

	public static void AssemblerMechanism() {
		ConcreatColorMapper colorMapper = new ConcreatColorMapper();
		colorMapper.put(IColor.class, RedColor.class);
		abstractDictionaryBase.put(ConcreateColorFactory.class,colorMapper);
	}
	
	public static void Assembly(IAbstractFactoryWithMapper factory) {
		
		AbstractMapperBase abstractMapperBase = abstractDictionaryBase.get(factory.getClass());
		factory.setAbstractMapperBase(abstractMapperBase);
	}

	public static void main(String[] args) {
		IAbstractFactoryWithMapper abstractFactoryWithMapper = new ConcreateColorFactory();
		Assembler.AssemblerMechanism();
		Assembler.Assembly(abstractFactoryWithMapper);
		try {
			IColor iColor = (IColor) abstractFactoryWithMapper.createObject(IColor.class);
			iColor.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
