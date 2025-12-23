package com.rabbitmq.springboot.controller;

import com.rabbitmq.springboot.dto.User;
import com.rabbitmq.springboot.publisher.RabbitMQJsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class MessageJsonController {

    @Autowired
    private RabbitMQJsonProducer  rabbitMQJsonProducer;


    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody User user){

rabbitMQJsonProducer.sendMessage(user);
return ResponseEntity.ok("Json message sent to RabbitMQ... ");
    }
}
