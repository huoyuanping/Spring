package com.et.lession03.log;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * spring 的生命周期
 * @author Administrator
 *
 */

public class TestCotainer {

	static ConfigurableApplicationContext context;
	
	static{
		//创建容器对象
		 context=new ClassPathXmlApplicationContext("classpath:/com/et/lession03/log/spring.xml");
	
	}
	public static void main(String[] args) {
		User ho=(User)context.getBean("user");
		for(int i=0;i<=5;i++){
			ho.login();
		}
		ho.buy();
		ho.buy();
		Admin ad=(Admin)context.getBean("admin");
		ad.addCom();
		ad.addCom();
		ad.addCom();

		
	}
}
