package com.example.kafka.kafkaexample.controller

import com.example.kafka.kafkaexample.producer.Producer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController(val producer: Producer) {

    @PostMapping("/publish")
    fun messageToTopic(@RequestParam message: String) = producer.sendMessage(message)

}
