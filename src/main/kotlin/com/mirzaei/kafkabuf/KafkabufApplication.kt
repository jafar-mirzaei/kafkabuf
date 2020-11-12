package com.mirzaei.kafkabuf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkabufApplication

fun main(args: Array<String>) {
	runApplication<KafkabufApplication>(*args)
}
