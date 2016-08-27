package com.agritsik.ds.boundary;

import com.agritsik.ds.entity.Message;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by andrey on 7/7/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageRepositoryIT {

    private Faker f;

    @Autowired
    private MessageRepository messageRepository;

    @Before
    public void setUp() throws Exception {
        f = new Faker();
    }

    @Test
    public void testSaveMessage() throws Exception {
        // arrange
        Message message = new Message(f.lorem().sentence(10));

        // act
        messageRepository.save(message);

        // assert
        Assert.assertEquals(1, messageRepository.count());
    }
}