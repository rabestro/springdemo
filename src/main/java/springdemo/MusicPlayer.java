package springdemo;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private Music music;

    public MusicPlayer() {
    }

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}