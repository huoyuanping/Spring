package com.et.lession03.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * ʵ�ִ����ࣨ�н飩
 * @author Administrator
 *
 */
public class HouseProxy implements InvocationHandler {
	/**
	 * ������
	 */
	HouseOwner house;
	
	
	
	public HouseProxy(HouseOwner house) {
		
		this.house = house;
	}



	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("�����");
		System.out.println("���");
		System.out.println("��ɨ����");
		//ǰ��֪ͨ
		//֪ͨ����
		Object obj=null;
		try {
			obj = method.invoke(house, args);
			//����֪ͨ
		} catch (Exception e) {
			//�쳣֪ͨ
			e.printStackTrace();
		}
		//����֪ͨ
		System.out.println("��Ͱ����æ���");
		return obj;
	}

}
