package com.wang.object;

import com.wang.object.obj.WangObjInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WangObjectService {

	@Autowired
	private WangObjInterface wangObjInterface;

	public long getTime() {
		return wangObjInterface.getTime();
	}

	public WangObjInterface getWangObjInterface() {
		return wangObjInterface;
	}

	public void setWangObjInterface(WangObjInterface wangObjInterface) {
		this.wangObjInterface = wangObjInterface;
	}
}
