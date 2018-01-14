package com.et.lession03.log;

import org.springframework.stereotype.Component;

/**
 * 用户类
 * @author Administrator
 *
 */
@Component
public class User {
	/**
	 * 用户登录方法
	 */
	public void login(){
		System.out.println("用户登录");
	}
	public void buy(){
		System.out.println("用户购买");
	}

}
