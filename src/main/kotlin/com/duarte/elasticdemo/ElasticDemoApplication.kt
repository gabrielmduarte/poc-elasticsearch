package com.duarte.elasticdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ElasticDemoApplication()

fun main(args: Array<String>) {
	runApplication<ElasticDemoApplication>(*args)
}
