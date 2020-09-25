package springcourse.music;

import java.util.ResourceBundle;

public class JazzMusic implements Music {
    private final ResourceBundle bundle;
    private final String[] songs;

    public JazzMusic(ResourceBundle bundle) {
        this.bundle = bundle;
        songs = bundle.getString("jazz").split("\f");
    }

    @Override
    public String getSongs() {
        return Music.pickSong(songs);
    }
}
