package com.example.kafka.kafkaexample.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class Producer(val kafkaTemplate: KafkaTemplate<String, String>) {

    val TOPIC: String = "test"

    fun sendMessage(message: String) {
        kafkaTemplate.send(TOPIC, message)
    }

}