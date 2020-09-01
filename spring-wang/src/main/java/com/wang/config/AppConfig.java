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
package com.wang.config;

import com.wang.annotation.EnableSpringStudy;
import com.wang.bean.E;
import com.wang.bean.F;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(value = "com.wang")
@EnableAspectJAutoProxy
@Configuration
@EnableAsync
@EnableTransactionManagement
public class AppConfig {

	/**
	 * 明天参照47 CGLib 原理分析 进行代码debug    -20200229
	 */

	@Bean("eBean")
	public E e() {
		System.out.println("e init");
		f();
		return new E();
	}

	@Bean("fBean")
	public F f() {
		System.out.println("f init");
		return new F();
	}


}
