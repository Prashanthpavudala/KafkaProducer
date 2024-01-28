package com.learning.kafkaproducer.controller;

import com.learning.kafkaproducer.service.LocationService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/update")
    public ResponseEntity<?> locationUpdate() {
        log.info("Inside locationUpdate!!!!!");
        locationService.updateLocation();
        return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }

}
