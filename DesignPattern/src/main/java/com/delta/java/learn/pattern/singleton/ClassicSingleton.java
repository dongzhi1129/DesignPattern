package com.delta.java.learn.pattern.singleton;

public class ClassicSingleton {

	private static  ClassicSingleton CLASSIC_SINGLETON = null;

	private ClassicSingleton() {
	}

	public static ClassicSingleton getInstance() {
		if (null == CLASSIC_SINGLETON) {
			CLASSIC_SINGLETON = new ClassicSingleton();
			return CLASSIC_SINGLETON;
		}
		return CLASSIC_SINGLETON;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(ClassicSingleton.getInstance().hashCode());
					
				}
			});
			thread.start();
			
		}

	}

}
