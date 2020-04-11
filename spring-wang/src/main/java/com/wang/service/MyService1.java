/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/1/3
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class MyService1 {

	@Autowired
	private NormalService1 normalService1;

	public MyService1(){

	}

//	@Autowired
	public MyService1(UserService userService){
		System.out.println("MyService1");
	}

	public MyService1(UserService userService, IndexService indexService){

	}
}
