package com.chenzilong;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DynomicProxy implements InvocationHandler {

	Object delegate;// delegate是代表的意思
	Logger logger=Logger.getLogger(this.getClass().getName());
	public Object bind(Object delegate) {//bind绑定
			this.delegate=delegate;
			Class cc=delegate.getClass();
			return Proxy.newProxyInstance(cc.getClassLoader(),cc.getInterfaces(),this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		logger.log(Level.INFO, "before delete");
		System.out.println(args[0]);
		Object retuValue=method.invoke(delegate, args);
		logger.log(Level.INFO, "after delete");
		return retuValue;
	}

}
