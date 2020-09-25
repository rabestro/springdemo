package springcourse;

import springcourse.music.Music;

import java.util.List;
import java.util.Random;

public class SimpleMusicPlayer implements MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList;
    private Random random = new Random();

    public SimpleMusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

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
        System.out.println(musicList
                .get(random.nextInt(musicList.size()))
                .getSongs()
        );
    }
}