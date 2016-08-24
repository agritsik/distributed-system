package com.agritsik.ds.server.boundary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrey on 7/5/16.
 */
public class UsersRepositoryTest {

    @Test
    public void findAll() throws Exception {

        // arrange
        UsersRepository repository = new UsersRepository();
        repository.find().stream().forEach(System.out::println);

        // act && assert
        assertEquals(99, repository.find().size());

    }   

}