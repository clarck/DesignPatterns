package com.cnblog.clarck;

public class Singleton {
	private static Singleton mInstance;
	private static final Object mLock = new Object();

	private Singleton() {
	}

	public static Singleton getInstance() {
		// 双重锁
		if (mInstance == null) {
			// 加锁
			synchronized (mLock) {
				if (mInstance == null) {
					mInstance = new Singleton();
				}
			}
		}

		return mInstance;
	}
}
