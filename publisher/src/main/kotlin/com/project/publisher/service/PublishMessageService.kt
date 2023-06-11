package com.project.publisher.service

import com.project.publisher.property.RabbitMQProperty
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class PublishMessageService(
    private val rabbitTemplate: RabbitTemplate
) {

    fun execute() {
        rabbitTemplate.convertAndSend(RabbitMQProperty.EXCHANGE_NAME, RabbitMQProperty.ROUTING_KEY, "success!")
    }

}