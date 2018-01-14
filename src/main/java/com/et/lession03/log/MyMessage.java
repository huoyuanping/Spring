package com.et.lession03.log;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
/**
 * 消息类
 */
import org.springframework.stereotype.Component;
//生成bean注解

@Component
public class MyMessage {
	Logger  logger=Logger.getLogger(MyMessage.class);
	//前置通知
	public void beforeSeek(JoinPoint jp){
		
		String method=jp.getSignature().getName();
		logger.debug("方法"+method+":调用");

	}
	
}
