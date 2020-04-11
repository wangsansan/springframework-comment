/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/3/17
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.service;

import com.wang.annotation.WangAnno;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class WangAspectService {

	@PostConstruct
	public void init() {

	}

	public void test() {
		System.out.println("--------logic-----test");
	}

	@WangAnno
	public void test1() {
		System.out.println("-------logic-----test1");
	}

}
