package com.et.lession03.log;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
/**
 * ��Ϣ��
 */
import org.springframework.stereotype.Component;
//����beanע��

@Component
public class MyMessage {
	Logger  logger=Logger.getLogger(MyMessage.class);
	//ǰ��֪ͨ
	public void beforeSeek(JoinPoint jp){
		
		String method=jp.getSignature().getName();
		logger.debug("����"+method+":����");

	}
	
}
