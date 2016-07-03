package com.agritsik.ds.boundary;

import com.agritsik.ds.entity.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andrey on 7/7/16.
 */
public interface MessageRepository extends CrudRepository<Message, Long> {

}
