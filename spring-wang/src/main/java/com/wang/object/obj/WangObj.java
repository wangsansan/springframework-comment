package com.wang.object.obj;

import java.util.Random;

/**
 * 实际注入的对象
 */
public class WangObj implements WangObjInterface {

	private long time;

	public WangObj() {
		long randomValue = new Random().nextLong();
		randomValue = Math.abs(randomValue);
		this.time = Long.MAX_VALUE - randomValue;
	}

	@Override
	public long getTime() {
		return time;
	}
}
