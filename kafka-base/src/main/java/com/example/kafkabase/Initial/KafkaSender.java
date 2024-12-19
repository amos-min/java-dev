package com.example.kafkabase.Initial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static com.example.kafkabase.config.KafkaConfig.TOPIC_N;

@Component
public class KafkaSender {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMes() throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10),
                new ThreadPoolExecutor.CallerRunsPolicy());
        while (true) {
            executor.submit(()->{
                kafkaTemplate.send(TOPIC_N, "hello world");
            });
            TimeUnit.SECONDS.sleep(1);
        }

    }


}
