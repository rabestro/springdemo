package springdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // IoC

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void playMusic() {
        musicList.forEach(music -> System.out.println("Playing: " + music.getSong()));
    }
}