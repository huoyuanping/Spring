package com.et.lession03.java;

import java.lang.reflect.Proxy;
/**
 * java的动态代理
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		// 被拦截的房东房租类
		HouseOwner ho=new AfHouseOwner(); 
		//实现拦截类
		HouseProxy hp=new HouseProxy(ho);
	
		HouseOwner hpex=(HouseOwner)Proxy.newProxyInstance(Test.class.getClassLoader(),
				ho.getClass().getInterfaces(), hp);
		hpex.seekMyHouse();
	}
	
}
