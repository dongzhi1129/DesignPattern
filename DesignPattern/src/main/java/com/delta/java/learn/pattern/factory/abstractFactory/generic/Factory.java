package com.delta.java.learn.pattern.factory.abstractFactory.generic;

public class Factory {
	
	public static IFactory getFactory(String choice) throws Exception {
		
		if("color".equals(choice)) {
			return new ColorFactory();
		}else if("shape".equals(choice)) {
			return new ShapeFactory();
		} else {
			throw new Exception();
		}
	}
	
	public static void main(String[] args) {
		try {
			IFactory iFactory = Factory.getFactory("color");
			IColor iColor = iFactory.createColor("red");
			iColor.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
