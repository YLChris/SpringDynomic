package test;

import com.chenzilong.DynomicProxy;
import com.chenzilong.LogProxy;
import com.chenzilong.User;
import com.chenzilong.UserImpl;

public class testLog {

	public static void main(String[] args) {
	/*	LogProxy logger = new LogProxy(new UserImpl());静态代理测试
		logger.delete("tom");*/
		//动态代理测试
		User u=(User) new DynomicProxy().bind(new UserImpl());
		u.delete("tom");
	}
	
}
