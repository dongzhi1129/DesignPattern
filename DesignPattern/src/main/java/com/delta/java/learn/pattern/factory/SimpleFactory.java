package com.delta.java.learn.pattern.factory;

import com.delta.java.learn.pattern.factory.bean.GlassProduct;
import com.delta.java.learn.pattern.factory.bean.Product;
import com.delta.java.learn.pattern.factory.bean.WheelProduct;
import com.delta.java.learn.pattern.factory.constant.ObjectTypeEnum;

public class SimpleFactory {

	public Product create(ObjectTypeEnum objectTypeEnum) {

		ObjectTypeEnum typeEnum = ObjectTypeEnum.OBJECT_TYPE_UNKNOWN;
		if (objectTypeEnum.equals(typeEnum)) {
			throw new IllegalArgumentException(typeEnum.getDescription());
		}
		if (ObjectTypeEnum.OBJECT_TYPE_GLASS.equals(objectTypeEnum)) {
			return new GlassProduct();
		} else if (ObjectTypeEnum.OBJECT_TYPE_WHELL.equals(objectTypeEnum)) {
			return new WheelProduct();
		} else {
			throw new IllegalArgumentException(typeEnum.getDescription());
		}
	}
	
	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz =  Class.forName("com.delta.java.learn.pattern.factory.SimpleFactory");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			SimpleFactory simpleFactory = (SimpleFactory) clazz.newInstance();
			Product product = simpleFactory.create(ObjectTypeEnum.OBJECT_TYPE_GLASS);
			product.doSomething();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}