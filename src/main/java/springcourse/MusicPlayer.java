package springcourse;

import springcourse.music.Music;

public interface MusicPlayer {
    void playMusic();

    void playMusic(Music.Genre genre);
}
