package com.et.lession02.anno;
/**
 * ע��@Component��spring�����Զ�ʵ������ǰ��
 * id=��������ĸСд
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
