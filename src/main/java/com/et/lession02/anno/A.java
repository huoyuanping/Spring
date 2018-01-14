package com.et.lession02.anno;
/**
 * 注解@Component让spring容器自动实例化当前类
 * id=类名首字母小写
 */
import org.springframework.stereotype.Component;

@Component("abc")
public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
