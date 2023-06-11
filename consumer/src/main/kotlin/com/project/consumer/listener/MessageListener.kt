package com.project.consumer.listener

import mu.KotlinLogging
import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import java.nio.charset.Charset

private val log = KotlinLogging.logger {  }

@Component
class MessageListener {


    @RabbitListener(queues = ["test.queue"])
    fun receiveMessage(message: Message) {
        log.info(String(message.body, Charset.forName("UTF-8")))
    }

}