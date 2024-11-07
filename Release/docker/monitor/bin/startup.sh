#!/bin/bash

export BASE_DIR=`cd $(dirname $0)/..; pwd`
export JAR_LOCATION=${BASE_DIR}/jar/ac-app-monitor.jar
export LOG_LOCATION=${BASE_DIR}/config/logback-spring.xml

exec java -jar ${JAR_LOCATION} --logging.config=${LOG_LOCATION}