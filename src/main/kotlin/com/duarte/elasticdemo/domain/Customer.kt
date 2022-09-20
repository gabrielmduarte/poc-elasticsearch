package com.duarte.elasticdemo.domain

import java.util.UUID
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "customer")
data class Customer(@Id val id: UUID, val name: String)