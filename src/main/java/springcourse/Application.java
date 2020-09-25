package springcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final var player1 = context.getBean("randomMusicPlayer", MusicPlayer.class);
        final var player2 = context.getBean("randomMusicPlayer", MusicPlayer.class);
        player1.playMusic();
        player1.playMusic();
        player2.playMusic();
        player2.playMusic();
        context.close();
    }
}
