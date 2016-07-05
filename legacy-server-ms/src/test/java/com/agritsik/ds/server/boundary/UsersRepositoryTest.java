package com.agritsik.ds.server.boundary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrey on 7/5/16.
 */
public class UsersRepositoryTest {

    @Test
    public void testInit() throws Exception {


        // debug
        UsersRepository repository = new UsersRepository();

        repository.getAll()
                .stream()
                .forEach(System.out::println);

        assertEquals(99, repository.getAll().size());


    }


}