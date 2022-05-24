package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usarName;
    private String password;

    private String email;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public User() {
    }

    public User(String usarName, String password, String email) {
        this.usarName = usarName;
        this.password = password;
        this.email = email;
    }

    public String getUsarName() {
        return usarName;
    }

    public void setUsarName(String usarName) {
        this.usarName = usarName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "usarName='" + usarName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
