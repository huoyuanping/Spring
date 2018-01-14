package com.et.lession02.mvc;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.et.lession02.mvc.controller.MyController;

public class MyView {
static ConfigurableApplicationContext context;
	
	static{
		//创建容器对象
		 context=new ClassPathXmlApplicationContext("classpath:/com/et/lession02/mvc/spring.xml");
	
	}

	private static MyController cont;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			while(true){
				System.out.println("请输入sql语句");
				String sql=	sc.nextLine();
				cont=(MyController)context.getBean("myController");
				cont.service(sql);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			context.close();
			
		}
	}
}
