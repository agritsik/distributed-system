package com.agritsik.ds.boundary;

import com.agritsik.ds.AppConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by andrey on 7/7/16.
 */
@Component
public class MessageSub {

    @RabbitListener(queues = AppConfiguration.queueName, id = "bus")
    public void listen(String msg){
        System.out.println(msg);
    }

}
