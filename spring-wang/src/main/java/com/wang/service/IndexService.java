/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2019/12/18
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.service;

import com.wang.annotation.WangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

//@WangService
@Service
//@Async
public class IndexService {

	@Autowired
	private UserService userService;

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public UserService getUserService() {
		return userService;
	}

	/**
	 * byType的时候，方法名不重要，只要变量类型归Spring管理就行，就会被调用
	 * byName就要求方法名截断之后的属性名归spring管理，同时入参的类型归spring管理，而且和name一致，所以byName其实更严苛
	 */
//	@Autowired
//	public void xxxx(NormalService myService1, NormalService myService2){
//		System.out.println(myService1);
//	}
//
//	@Autowired
//	public void xxxx1(UserService userService){
//		System.out.println(userService);
//	}

	@PostConstruct
	public void print() {
		System.out.println(userService);
	}

	@Autowired
	public void setUserService(UserService userService) {
		System.out.println("wang");
	}

}
