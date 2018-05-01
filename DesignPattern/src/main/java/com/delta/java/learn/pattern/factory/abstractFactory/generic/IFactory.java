package com.delta.java.learn.pattern.factory.abstractFactory.generic;

public interface IFactory {
	
	IShape createShape(String shape);
	
	IColor createColor(String color);

}
