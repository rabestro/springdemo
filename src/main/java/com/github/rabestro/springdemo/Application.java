package com.github.rabestro.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.text.MessageFormat.format;

public class Application implements CommandLineRunner {
    TestBean testBean;

    @Override
    public void run(String... args) throws Exception {


        final var context = new ClassPathXmlApplicationContext("application-context.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(format("Hello, {0}!", testBean.getName()));

        context.close();
    }
}
