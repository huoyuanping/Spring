package com.et.lession03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
//生成bean注解
@Component
public class MyMessage {
	//前置通知
	public void beforeSeek(){
		System.out.println("打扫卫生");
	}
	//后置通知
	public void afterSeek(){
		System.out.println("收钱");
	}
	//异常通知
	public void throwException(JoinPoint jp){
		System.out.println("出现异常");
		//输出目标对象
		System.out.println(jp.getTarget());
		//输出方法
		System.out.println(jp.getSignature().getName());
		
	}
}
