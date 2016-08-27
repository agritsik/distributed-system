package com.agritsik.ds;

import org.springframework.amqp.rabbit.test.RabbitListenerTest;
import org.springframework.context.annotation.Configuration;

/**
 * Created by andrey on 7/7/16.
 */
@Configuration
@RabbitListenerTest(spy = false, capture = true)
public class TestConfiguration {


}
