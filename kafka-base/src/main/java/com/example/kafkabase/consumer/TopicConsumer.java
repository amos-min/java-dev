package com.example.kafkabase.consumer;

import com.example.kafkabase.config.KafkaConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;


@Component
public class TopicConsumer {



    @KafkaListener(topics = KafkaConfig.TOPIC_N, groupId = "my-group", containerFactory = "kafkaListenerContainerFactory")
    public void onMessage(ConsumerRecord<String, String> record, Acknowledgment acknowledgment) {
        System.out.println(record.toString());
        acknowledgment.acknowledge();
    }


}