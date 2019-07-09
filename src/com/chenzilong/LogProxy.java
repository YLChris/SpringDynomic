package com.chenzilong;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogProxy implements User {
	// 静态代理只能代理一个类
	Logger logger = Logger.getLogger(this.getClass().getName());
	private User user;

	public LogProxy(User user) {
		this.user = user;
	}

	@Override
	public void delete(String name) {
		logger.log(Level.INFO, "brfore delete");
		user.delete(name);
		logger.log(Level.INFO, "after delete");
	}

}
