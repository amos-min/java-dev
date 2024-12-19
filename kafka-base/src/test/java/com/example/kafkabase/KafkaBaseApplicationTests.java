package com.example.kafkabase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class KafkaBaseApplicationTests {


    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Test
    void contextLoads() {
    }

}
