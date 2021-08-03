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
package com.wang.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WangServiceAspect {

	@Around("@within(com.wang.annotation.WangService) || @annotation(com.wang.annotation.WangService)")
	public Object testAspect(ProceedingJoinPoint joinPoint) {
		System.out.println("-----wangservice-----before----------");
		try {
			Object proceed = joinPoint.proceed();
			return proceed;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return null;
	}

}
