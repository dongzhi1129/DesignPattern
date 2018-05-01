package com.delta.java.learn.pattern.factory.abstractFactory.generic;

public class ColorFactory implements IFactory {

	public IShape createShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	public IColor createColor(String color) {
		// TODO Auto-generated method stub
		if("red".equals(color)) {
			return new RedColor();
		}
		return null;
	}

}
