package com.et.lession03.aop;

import org.springframework.stereotype.Component;

@Component
public class AfHouseOwner{
	/**
	 * �ⷿ����
	 */
	public void seekMyHouse(){
		System.out.println("����ѧԺ�����ⷿ");
	}
	public void seekMyHouse(String str){
		System.out.println("����ѧԺ�����ⷿ");
	}
}
