/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/4/11
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.selector;

import com.wang.config.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class SpringStudySelector implements ImportSelector, BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
		System.out.println(beanFactory);
		return new String[]{AppConfig.class.getName()};
	}
}
