package com.et.lession03.java;

import java.lang.reflect.Proxy;
/**
 * java�Ķ�̬����
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		// �����صķ���������
		HouseOwner ho=new AfHouseOwner(); 
		//ʵ��������
		HouseProxy hp=new HouseProxy(ho);
	
		HouseOwner hpex=(HouseOwner)Proxy.newProxyInstance(Test.class.getClassLoader(),
				ho.getClass().getInterfaces(), hp);
		hpex.seekMyHouse();
	}
	
}
