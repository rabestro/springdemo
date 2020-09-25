package springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springcourse.music.ClassicalMusic;
import springcourse.music.JazzMusic;
import springcourse.music.Music;
import springcourse.music.RockMusic;

import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

@Configuration
public class SpringConfig {

    @Bean
    ResourceBundle bundleSongs() {
        return ResourceBundle.getBundle("songs");
    }

    @Bean
    RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    JazzMusic jazzMusic() {
        return new JazzMusic(bundleSongs());
    }

    @Bean
    ClassicalMusic classicalMusic() {
        final var music = new ClassicalMusic();
        music.setBundle(bundleSongs());
        return music;
    }

    @Bean
    List<Music> musicList() {
        return List.of(classicalMusic(), jazzMusic(), rockMusic());
    }

    @Bean
    MusicPlayer musicPlayer() {
        final var player = new SimpleMusicPlayer();
        player.setMusicList(musicList());
        return player;
    }

    @Bean
    UserBean userBean() {
        return new UserBean();
    }

    @Bean
    Computer computer() {
        return new Computer();
    }

    @Bean
    Random random() {
        return new Random();
    }
}
