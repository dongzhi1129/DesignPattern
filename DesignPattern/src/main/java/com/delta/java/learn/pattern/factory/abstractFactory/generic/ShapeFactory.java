package com.delta.java.learn.pattern.factory.abstractFactory.generic;

public class ShapeFactory implements IFactory {

	public IShape createShape(String shape) {
		// TODO Auto-generated method stub
		if("circle".equals(shape)) {
			return new CircleShape();
		}
		return null;
	}

	public IColor createColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
