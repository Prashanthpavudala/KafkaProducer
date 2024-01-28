package com.learning.kafkaproducer.config;

import com.learning.kafkaproducer.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Slf4j
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        log.info("Inside new topic creation!!");
        return TopicBuilder
                .name(Constants.LOCATION_TOPIC_NAME)
//                .partitions()
//                .replicas()
                .build();
    }

}
