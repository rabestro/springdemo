package com.github.rabestro.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}