#!/usr/bin/env bash

java -jar infra-discovery/target/*.jar &
java -jar infra-gateway/target/*.jar &
java -jar infra-monitor/target/*.jar &







