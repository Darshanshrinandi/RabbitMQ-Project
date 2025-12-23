package com.rabbitmq.springboot.consumer;

import com.rabbitmq.springboot.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQJsonConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consumeMessage(User user){
        log.info(String.format("Received Json message -> %s",user.toString()));

    }
}
