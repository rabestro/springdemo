package springcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements CommandLineRunner {

    private MusicPlayer musicPlayer;

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final var user = context.getBean("userBean", UserBean.class);
        System.out.println("Hello, " + user.getName() + "!");

        musicPlayer = context.getBean("randomMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic(Music.Genre.JAZZ);
        context.close();
    }
}
