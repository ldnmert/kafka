package com.merteld.kafka_producer.service;

import com.merteld.kafka_producer.dto.Person;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send("x-topic", message);

    }

    public void sendObject(Person person) {
        kafkaTemplate.send("y-topic", person);
    }

}
