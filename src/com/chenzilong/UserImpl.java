package com.chenzilong;

//import java.util.logging.Level;
//import java.util.logging.Logger;

public class UserImpl implements User {

	// Logger logger=Logger.getLogger(this.getClass().getName());//给当前的类写入日志
	@Override
	public void delete(String name) {
		// logger.log(Level.INFO, "before delete");
		// 此处的level.info是日志被写出的形式，是标准信息形式还是警告 INFO:before delete warning:before
		// delete
		System.out.println("删除成功！！");
		// logger.log(Level.INFO, "after delete");
	}

}
