package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Wangchunsheng
 * @Date: 2021/8/9 11:24 上午
 */
public abstract class AbstractNewService {

	@Autowired
	private MyService myService;

	public MyService getMyService() {
		return myService;
	}
}
