package com.agritsik.ds.entity;

import javax.persistence.*;

/**
 * Created by andrey on 7/7/16.
 */

@Entity
@Table(name = "messages")
public class Message {


    @Id
    @GeneratedValue
    private int id;

    private String body;

    public Message() {
    }

    public Message(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
