[![Build Status](https://travis-ci.org/agritsik/distributed-system.svg?branch=master)](https://travis-ci.org/agritsik/distributed-system)

# distributed-system
How to Build Resilient Distributed Systems

## Motivation

In order to demonstrate:

1. How to work with legacy systems.
2. How to process a huge amount of events

Techical goals:

1. implement microservices
2. implement patterns for resilient distributed systems
3. implement synchronious communication using REST (request/response)
4. implement asynchronious communication using AMQP (pub/sub and request/reply)
5. implement event store using different data storages (SQL and NoSQL) and compare their performance


## Tooling:

The following techologies will be used:

1. Java and Spring Boot are used for implementing microservices 
2. RabbitMQ is used as a communication layer
3. Spring Cloud Netflix is used for implementing Service Discovery, Curcuit Breaker etc
4. Docker is used for containerization 
5. Mysql, MongoDB, Cassandra etc are used as a persistence level

## Testing/Monitoring/Logging

TBD

