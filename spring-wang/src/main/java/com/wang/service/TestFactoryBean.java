/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/1/2
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<TestInterface> {
	@Override
	public TestInterface getObject() throws Exception {
		return new TestInterfaceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return TestInterface.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
