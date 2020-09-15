package com.github.rabestro.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
public class UserBean {
    private String name;

    public UserBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}