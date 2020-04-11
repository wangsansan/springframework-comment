/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/2/28
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.config;

import com.wang.annotation.EnableSpringStudy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(value = "com.wang")
@EnableSpringStudy
public class MyConfig {
}
