package com.delta.java.learn.pattern.singleton;

public class DoubleCheckSingleton {

	private static DoubleCheckSingleton CLASSIC_SINGLETON = null;

	private DoubleCheckSingleton() {
	}

	public static DoubleCheckSingleton getInstance() {
		if (null == CLASSIC_SINGLETON) {
			synchronized (DoubleCheckSingleton.class) {
				if (null == CLASSIC_SINGLETON) {
					CLASSIC_SINGLETON = new DoubleCheckSingleton();
				}
			}
		}
		return CLASSIC_SINGLETON;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					System.out.println(DoubleCheckSingleton.getInstance().hashCode());

				}
			});
			thread.start();

		}

	}

}
