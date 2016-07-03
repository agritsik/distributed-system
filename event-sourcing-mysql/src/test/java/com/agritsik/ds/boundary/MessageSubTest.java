package com.agritsik.ds.boundary;

import com.agritsik.ds.AppConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.test.RabbitListenerTestHarness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * Created by andrey on 7/7/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageSubTest {

    @Autowired
    AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitListenerTestHarness harness;

    @Test
    public void testReceiveMessage() throws Exception {

        // arrange
        String message = "hello form BUS";

        // act
        amqpTemplate.convertAndSend(AppConfiguration.queueName, message);

        // assert
        RabbitListenerTestHarness.InvocationData invocationData =
                this.harness.getNextInvocationDataFor("bus", 10, TimeUnit.SECONDS);

    }

}