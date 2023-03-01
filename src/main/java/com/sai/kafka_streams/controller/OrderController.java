package com.sai.kafka_streams.controller;

import com.sai.kafka_streams.model.Order;
import com.sai.kafka_streams.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/post")
    public void order(@RequestBody Order order) {
        kafkaProducerService.send(order);
    }

}

