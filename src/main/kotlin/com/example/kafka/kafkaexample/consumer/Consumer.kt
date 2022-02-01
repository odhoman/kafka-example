package com.example.kafka.kafkaexample.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class Consumer {

    @KafkaListener(topics = ["test"], groupId = "group_id")
    fun consumeMessage(message: String) {
        println("Consumer reads: $message")
    }

}