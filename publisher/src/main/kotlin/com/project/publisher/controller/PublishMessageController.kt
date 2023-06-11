package com.project.publisher.controller

import com.project.publisher.service.PublishMessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PublishMessageController(
    private val publishMessageService: PublishMessageService
) {

    @GetMapping
    fun publishMessage(): ResponseEntity<Map<String, String>> {
        publishMessageService.execute()
        return ResponseEntity.ok(mapOf("message" to "publish message success!"))
    }

}