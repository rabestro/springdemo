package springcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final var player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        context.close();
    }
}
