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
package com.wang.postprocessor;

import org.springframework.stereotype.Component;

@Component
public class MyPostProcessor1 implements MyPostProcessorInterface {
	@Override
	public void parse() {
		System.out.println("=========1======");
	}
}
