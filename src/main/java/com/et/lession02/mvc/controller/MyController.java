package com.et.lession02.mvc.controller;
import javax.annotation.Resource;

import com.et.lession02.mvc.ZhuJie;
import com.et.lession02.mvc.service.MyService;

@ZhuJie
public class MyController {
	/**
	 * 	@ResourceĬ�ϸ�������װ��
	 * @Resource(name="myService")��������װ��T
	 */
	@Resource(name="myService")
	MyService myService;
	public void service(String sql){
		System.out.println(myService.query(sql));
	}
}
