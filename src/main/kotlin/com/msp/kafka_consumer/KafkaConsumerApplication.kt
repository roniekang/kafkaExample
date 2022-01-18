package com.msp.kafka_consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaConsumerApplication

fun main(args: Array<String>) {
	runApplication<KafkaConsumerApplication>(*args)
}
