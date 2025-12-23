package com.rabbitmq.springboot.publisher;

import com.rabbitmq.springboot.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQJsonProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.binding.json.routing-key}")
    private String routing_json_key;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void sendMessage(User user){

        log.info("Json message sent -> %s",user.toString());
        rabbitTemplate.convertAndSend(exchange,routing_json_key,user);

    }
}
