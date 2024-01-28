package com.learning.kafkaproducer.service;

import com.learning.kafkaproducer.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String location) {
        log.info("Inside KafkaService with request {}", location);
        kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME, location);
    }

}
