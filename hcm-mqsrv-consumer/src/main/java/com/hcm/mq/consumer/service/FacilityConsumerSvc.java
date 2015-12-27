package com.hcm.mq.consumer.service;

import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class FacilityConsumerSvc {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	public String getTopicVitalsMsg() {
		
			String destinationName = "topicVitals";
			
			Message message = jmsTemplate.receive(destinationName);
			System.out.println(message);
		
		return message.toString();
	}
}
