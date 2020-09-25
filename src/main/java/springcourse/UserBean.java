package springcourse;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserBean {
    @Value("${userBean.name}")
    private String name;

    @PostConstruct
    void hi() {
        System.out.println("Hello, " + name + "!");
    }

    public String getName() {
        return name;
    }

    @PreDestroy
    void bye() {
        System.out.println("Goodbye, " + name + "!");
    }
}