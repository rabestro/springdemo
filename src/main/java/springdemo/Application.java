package springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.text.MessageFormat.format;

public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        final var userBean = context.getBean("userBean", UserBean.class);
        System.out.println(format("Hello, {0}!", userBean.getName()));

        final var musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
