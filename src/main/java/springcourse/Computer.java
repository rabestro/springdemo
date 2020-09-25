package springcourse;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {
    @Autowired
    MusicPlayer player;

    void run() {
        player.playMusic();
    }
}
