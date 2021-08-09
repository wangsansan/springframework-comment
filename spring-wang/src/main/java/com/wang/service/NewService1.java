package com.wang.service;

import org.springframework.stereotype.Service;

/**
 * @Author: Wangchunsheng
 * @Date: 2021/8/9 11:26 上午
 */
@Service
public class NewService1 extends AbstractNewService {

	public void doNewThing() {
		System.out.println(getMyService().getName());
	}

}
