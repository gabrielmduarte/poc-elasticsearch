package com.duarte.elasticdemo.client

import com.duarte.elasticdemo.domain.Customer
import com.duarte.elasticdemo.repository.DemoElasticSearchRepository
import java.util.UUID
import javax.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DemoElasticSearchClient(private val repository: DemoElasticSearchRepository) {

    fun saveCustomer(customer: Customer) {
        repository.save(customer)
    }

    fun findByName(name: String): Customer {
        return repository.findByName(name)
    }

    fun findById(uuid: UUID): Customer {
        return repository.findById(uuid).get()
    }

    @PostConstruct
    fun tests() {
        val customer = Customer(UUID.randomUUID(), "Gabriel Test")
        saveCustomer(customer)

        println("-------------------")
        println("find by id")
        val findById = findById(customer.id)
        println("${findById.name} found by id")
        println("-------------------")
        println("find by name")
        val findByName = findByName(customer.name)
        println("${findByName.name} found by name")
    }
}