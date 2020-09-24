package springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements CommandLineRunner {

//    @Autowired
//    @Qualifier("randomMusicPlayer")
    private MusicPlayer musicPlayer;

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        final var computer = context.getBean("computer", Computer.class);
//
//        computer.run();
//
        musicPlayer = context.getBean("randomMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic(Music.Genre.JAZZ);
        context.close();
    }
}
