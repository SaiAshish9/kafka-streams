package com.sai.kafka_stream_bindings.model;

import lombok.Data;

@Data
public class Order {
    private String item;
    private int quantity;
    private String deliveryType;
}

