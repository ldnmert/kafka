package com.merteld.kafka_producer.controller;

import com.merteld.kafka_producer.dto.Person;
import com.merteld.kafka_producer.service.ProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {

        for (int i = 0; i < 3000; i++) {
            producerService.sendMessage(message);
        }

        return ResponseEntity.ok(message);
    }

    @PostMapping("/object")
    public ResponseEntity<Person> sendMessageButJSON(@RequestBody Person person) {

        for (int i = 0; i < 1000; i++) {
            producerService.sendObject(person);
        }

        return ResponseEntity.ok(person);
    }


}
