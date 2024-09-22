package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Wangchunsheng
 * @Date: 2021/8/12 4:15 下午
 */
@Service
public class CycleService2 {

	@Autowired
	private CycleService1 cycleService1;

}
