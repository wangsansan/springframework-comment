/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/3/7
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class NormalService1 {

	@Autowired
	@Lazy
	private MyService myService;

	public void doSomething() {
		myService.getName();
	}

}
