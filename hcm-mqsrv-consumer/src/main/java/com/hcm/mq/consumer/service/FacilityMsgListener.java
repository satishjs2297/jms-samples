package com.hcm.mq.consumer.service;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQBytesMessage;
import org.springframework.stereotype.Component;

@Component
public class FacilityMsgListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>begin" + message);
		if(message instanceof ActiveMQBytesMessage) {
			ActiveMQBytesMessage txtMsg = (ActiveMQBytesMessage) message;
			System.out.println( "<<<<<<<<<<<<<" + txtMsg.getContent()+ ">>>>>>>>>>>>");
		}
		
	}

}
