package com.wang.object.factory;

import com.wang.object.obj.WangObj;
import com.wang.object.obj.WangObjInterface;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;

import java.io.Serializable;

/**
 * 参照Request的原理，让注入的对象可以不停变化：此处我们想要注入的对象是WangObjInterface类型的
 */
public class WangFactory implements ObjectFactory<WangObjInterface>, Serializable {

	private static final long serialVersionUID = -1L;

	@Override
	public WangObj getObject() throws BeansException {
		return new WangObj();
	}

	@Override
	public String toString() {
		return "my object factory";
	}
}
