package com.et.lession03.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 实现代理类（中介）
 * @author Administrator
 *
 */
public class HouseProxy implements InvocationHandler {
	/**
	 * 代理房东
	 */
	HouseOwner house;
	
	
	
	public HouseProxy(HouseOwner house) {
		
		this.house = house;
	}



	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("找租客");
		System.out.println("租金");
		System.out.println("打扫房子");
		//前置通知
		//通知房东
		Object obj=null;
		try {
			obj = method.invoke(house, args);
			//环绕通知
		} catch (Exception e) {
			//异常通知
			e.printStackTrace();
		}
		//后置通知
		System.out.println("租客搬入帮忙搬家");
		return obj;
	}

}
