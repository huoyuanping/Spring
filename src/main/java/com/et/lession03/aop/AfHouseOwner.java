package com.et.lession03.aop;

import org.springframework.stereotype.Component;

@Component
public class AfHouseOwner{
	/**
	 * 租房方法
	 */
	public void seekMyHouse(){
		System.out.println("安防学院房东租房");
	}
	public void seekMyHouse(String str){
		System.out.println("安防学院房东租房");
	}
}
