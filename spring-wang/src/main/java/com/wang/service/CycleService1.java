package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: Wangchunsheng
 * @Date: 2021/8/12 4:14 下午
 */
@Service
@DependsOn("cycleService2")
public class CycleService1 {

	@Autowired
	private CycleService2 cycleService2;

	@Async
	public void doThings() {
		System.out.println("it's a async move");
	}

}
