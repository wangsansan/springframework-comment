/**
 * *****************************************************
 * Copyright (C) 2019 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * @date 2020/4/5
 * @author wangchunsheng
 * ****************************************************
 **/
package com.wang.domain;

public class Son extends Father {

	private String d;

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Son{" +
				"d='" + d + '\'' +
				'}';
	}
}
