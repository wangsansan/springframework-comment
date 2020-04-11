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

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WangAnnoAspect {

	@Around("@within(com.wang.annotation.WangAnno) || @annotation(com.wang.annotation.WangAnno)")
	public void testAspect(ProceedingJoinPoint joinPoint) {
		System.out.println("----------before----------");
		try {
			joinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}

}
