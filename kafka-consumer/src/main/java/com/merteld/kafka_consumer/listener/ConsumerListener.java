package com.merteld.kafka_consumer.listener;

import com.merteld.kafka_consumer.model.Person;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @KafkaListener(topics = "x-topic", groupId = "a")
    public void listen(ConsumerRecord<String, String> record) {

      System.out.println(record.value());

    }

    @KafkaListener(topics = "x-topic", groupId = "a")
    public void listen2(ConsumerRecord<String, String> record) {

        System.out.println(record.value());

    }

    @KafkaListener(topics = "y-topic", groupId = "b")
    public void listen3(ConsumerRecord<String, Person> record) {

        System.out.println(record.value().getFirstName() + " " + record.value().getLastName());
    }

    @KafkaListener(topics = "y-topic",  groupId = "b")
    public void listen4(ConsumerRecord<String, Person> record) {

        System.out.println(record.value().getFirstName() + " " + record.value().getLastName());
    }

}
