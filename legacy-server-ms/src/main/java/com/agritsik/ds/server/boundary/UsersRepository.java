package com.agritsik.ds.server.boundary;

import com.agritsik.ds.server.entity.User;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static io.codearte.jfairy.producer.person.PersonProperties.male;

/**
 * Created by andrey on 7/5/16.
 */
@Repository
public class UsersRepository {

    private List<User> all = new ArrayList<>();

    public UsersRepository() {

       all = IntStream.range(1, 100)
               .mapToObj(i -> {
                   Person p = Fairy.create().person(male());
                   return new User(i, p.firstName(), p.lastName(), p.email());
               })
               .collect(Collectors.toList());

    }

    public List<User> getAll() {
        return all;
    }

    public List<User> findByName(String startsWith) {
        return all.stream().filter(o -> o.getFirstName().startsWith(startsWith)).collect(Collectors.toList());
    }



}
