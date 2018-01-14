package com.et.lession02.mvc.controller;
import javax.annotation.Resource;

import com.et.lession02.mvc.ZhuJie;
import com.et.lession02.mvc.service.MyService;

@ZhuJie
public class MyController {
	/**
	 * 	@Resource默认根据类型装配
	 * @Resource(name="myService")根据名字装配T
	 */
	@Resource(name="myService")
	MyService myService;
	public void service(String sql){
		System.out.println(myService.query(sql));
	}
}
