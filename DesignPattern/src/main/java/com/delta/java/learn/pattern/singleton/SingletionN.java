package com.delta.java.learn.pattern.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletionN {

	private static final int SINGLETION_POOL_MAX_SIZE = 10;

	private static final List<SingletionN> SINGLETION_POOL = Collections.synchronizedList(new ArrayList<SingletionN>());

	private SingletionN() {
	}

	public static SingletionN getInstance() throws Exception {
		SingletionN singletionN = null;
		if (SINGLETION_POOL.size() < SINGLETION_POOL_MAX_SIZE) {
			singletionN = new SingletionN();
			SINGLETION_POOL.add(singletionN);
		} else {
			throw new Exception("申请对象数量已超过最大数量");
		}
		return singletionN;
	}

	private static class ThreadClient extends Thread {

		public ThreadClient() {
		}

		@Override
		public void run() {

			try {
				System.out.println(SingletionN.getInstance().hashCode());
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}

	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			SingletionN.ThreadClient threadClient = new SingletionN.ThreadClient();
			threadClient.start();
		}
	}

}
