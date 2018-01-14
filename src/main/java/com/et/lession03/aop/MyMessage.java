package com.et.lession03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
//����beanע��
@Component
public class MyMessage {
	//ǰ��֪ͨ
	public void beforeSeek(){
		System.out.println("��ɨ����");
	}
	//����֪ͨ
	public void afterSeek(){
		System.out.println("��Ǯ");
	}
	//�쳣֪ͨ
	public void throwException(JoinPoint jp){
		System.out.println("�����쳣");
		//���Ŀ�����
		System.out.println(jp.getTarget());
		//�������
		System.out.println(jp.getSignature().getName());
		
	}
}
