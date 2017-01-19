package com.example.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
<<<<<<< HEAD
 * Created by Luke Hardman on 01/12/16.
=======
 * Created by Louie Qin on 01/12/16.
>>>>>>> 9fa015fd5af7fd4ac8079492f2d825755a0a5801
 */
@Entity
public class Note {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
