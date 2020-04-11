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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	private String name;

//	public MyService(){
//		System.out.println("no args");
//	}


//	@Autowired(required = false)
	public MyService(Class<UserService> userService){
		System.out.println("=======1111111111111111===================");
	}

//	@Autowired(required = false)
	public MyService(UserService userService, IndexService indexService){
		System.out.println("========222222222222222===================");
	}

	public MyService(UserService userService, IndexService indexService, String str){
		System.out.println("========33333333333333333===================");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
