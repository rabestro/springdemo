package springcourse;

import java.util.ResourceBundle;

public class JazzMusic implements Music {
    private ResourceBundle bundle;
    private String[] songs;

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    private void init() {
        songs = bundle.getString("jazz").split("\f");
    }

    @Override
    public String getSongs() {
        return Music.pickSong(songs);
    }
}
