package springdemo;

import java.util.ResourceBundle;

public class JazzMusic implements Music {
    private ResourceBundle bundle;
    private String song;

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    private void init() {
        song = bundle.getString("jazz");
    }

    @Override
    public String getSong() {
        return song;
    }
}
