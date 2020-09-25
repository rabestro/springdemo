package springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springcourse.music.Music;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
@Scope("prototype")
public class RandomMusicPlayer implements MusicPlayer {

    private Music music;
    private final Music[] genres;

    @Autowired
    public RandomMusicPlayer(
            @Qualifier("jazzMusic") Music jazz,
            @Qualifier("classicalMusic") Music classic,
            @Qualifier("rockMusic") Music rock
    ) {
        genres = new Music[]{jazz, classic, rock};
    }

    @PostConstruct
    void pickGenre() {
        music = genres[new Random().nextInt(genres.length)];
    }

    @Override
    public void playMusic() {
        System.out.println("Playing: " + music.getSongs());
    }
}
