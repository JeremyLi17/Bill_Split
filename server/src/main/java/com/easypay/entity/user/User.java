package com.easypay.entity.user;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.*;

/**
 * @author jeremy on 2023/1/25
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(nullable = false, updatable = false)
    Long id;

    private String username;
    private String email;
    private String password;
    private String profileImageUrl;

    public User() {}

    public User(Long id,
                String username,
                String email,
                String password,
                String profileImageUrl) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profileImageUrl = profileImageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
