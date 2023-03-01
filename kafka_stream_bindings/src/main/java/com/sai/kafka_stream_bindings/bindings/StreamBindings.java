package com.sai.kafka_stream_bindings.bindings;

import com.sai.kafka_stream_bindings.model.Order;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

public interface StreamBindings {

    @Input("order-input-channel")
    KStream<String, Order> inputStream();

    @Output("order-takeaway-output-channel")
    KStream<String, Order> takeAwayStream();

    @Output("order-homedelivery-output-channel")
    KStream<String, Order> homeDeliveryStream();

}
