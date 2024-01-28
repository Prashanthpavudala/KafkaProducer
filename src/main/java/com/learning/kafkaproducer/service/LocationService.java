package com.learning.kafkaproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LocationService {

    @Autowired
    private KafkaService kafkaService;

    public void updateLocation() {
        log.info("Inside LocationService...");
        int i=1000;
        while(i>0) {
            kafkaService.send("( "+getRandomNumber()+","+getRandomNumber()+ " )");
            i--;
        }
    }

    private String getRandomNumber() {
        return String.valueOf(Math.round(Math.random()*100));
    }

}
