package com.et.lession03.log;

import org.springframework.stereotype.Component;

/**
 * �û���
 * @author Administrator
 *
 */
@Component
public class User {
	/**
	 * �û���¼����
	 */
	public void login(){
		System.out.println("�û���¼");
	}
	public void buy(){
		System.out.println("�û�����");
	}

}
