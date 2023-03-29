package com.easypay.entity;

import org.hibernate.boot.model.relational.Sequence;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity

public class User {
    @Id
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "USER_SEQUENCE"
    )
    @SequenceGenerator(
            name = "USER_SEQUENCE",
            sequenceName = "USER_SEQUENCE",
            initialValue = 1,
            allocationSize = 1
    )
    long id;
    String username;
    String password;
    String email;
    Integer balance;

    public User() {}
//command + n -> generator -> select None meaning no need to manual add User ID
    public User(long id, String username, String password, String email, Integer balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.balance = balance;
    }
}
