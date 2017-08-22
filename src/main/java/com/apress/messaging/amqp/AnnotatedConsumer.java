package com.apress.messaging.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class AnnotatedConsumer {

	@RabbitListener(queues="${apress.amqp.queue}")
	public void process(String message){
		
	}
}
