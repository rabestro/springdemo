package springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    SimpleMusicPlayer player;

    void run() {
        player.playMusic();
    }
}
