package com.rabbitmq.springboot.publisher;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.binding.routing-key}")
    private String routing_key;

    @Autowired
    private RabbitTemplate rabbitTemplate;




    public void sendMessage(String message){
        log.info(" Message sent : %s", message);
        rabbitTemplate.convertAndSend(exchange,routing_key,message);
    }


}
