package com.duarte.elasticdemo.repository

import com.duarte.elasticdemo.domain.Customer
import java.util.UUID
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoElasticSearchRepository: ElasticsearchRepository<Customer, UUID> {

    fun findByName(name: String): Customer

}