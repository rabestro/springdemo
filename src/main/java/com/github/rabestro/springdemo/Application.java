package com.github.rabestro.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.text.MessageFormat.format;

public class Application implements CommandLineRunner {
    UserBean userBean;

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("application-context.xml");

        UserBean userBean = context.getBean("userBean", UserBean.class);
        System.out.println(format("Hello, {0}!", userBean.getName()));

        final var music = context.getBean("musicBean", Music.class);
        final var musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }
}
