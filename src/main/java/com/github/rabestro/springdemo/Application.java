package com.github.rabestro.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements CommandLineRunner {
    TestBean testBean;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, World!");

        final var context = new ClassPathXmlApplicationContext("application-context.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        context.close();
    }
}
