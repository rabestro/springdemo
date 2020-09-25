package springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springcourse.music.Music;

@Component
public class RandomMusicPlayer implements MusicPlayer {

    private Music.Genre genre = Music.Genre.CLASSIC;
    private Music jazz;
    private Music classic;
    private Music rock;

    @Autowired
    public RandomMusicPlayer(
            @Qualifier("jazzMusic") Music jazz,
            @Qualifier("classicalMusic") Music classic,
            @Qualifier("rockMusic") Music rock

    ) {
        this.jazz = jazz;
        this.classic = classic;
        this.rock = rock;
    }

    public void setGenre(Music.Genre genre) {
        this.genre = genre;
    }

    @Override
    public void playMusic() {
        playMusic(genre);
    }

    @Override
    public void playMusic(Music.Genre genre) {
        System.out.println("Playing: " + (switch (genre) {
            case CLASSIC -> classic;
            case JAZZ -> jazz;
            default -> rock;
        }).getSongs());
    }
}
