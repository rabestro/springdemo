package springcourse.music;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ResourceBundle;

public class ClassicalMusic implements Music {
    private ResourceBundle bundle;
    private String[] song;

    @Autowired
    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
        song = bundle.getString("classical").split("\f");
    }

    @Override
    public String getSongs() {
        return Music.pickSong(song);
    }
}