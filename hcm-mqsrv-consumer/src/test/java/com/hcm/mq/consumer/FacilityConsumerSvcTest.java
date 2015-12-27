package com.hcm.mq.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hcm.mq.consumer.service.FacilityConsumerSvc;
import com.hcm.mq.consumer.service.FacilityMsgListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-jms-context.xml" })
public class FacilityConsumerSvcTest {

	@Autowired
	private FacilityConsumerSvc facilityConSvc;
	
	/*@Autowired
	private FacilityMsgListener facilityMsgListener;*/

	@Test
	public void testReceiveVitalMsg() throws InterruptedException {

		int count = 0;
		//System.out.println("facilityMsgListener :: "+facilityMsgListener);
		Thread.sleep(Long.MAX_VALUE);
		
	}

}
