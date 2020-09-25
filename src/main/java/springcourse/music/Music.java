package springcourse.music;

import java.util.Random;

public interface Music {
    Random random = new Random();

    static String pickSong(final String[] songs) {
        return songs[random.nextInt(songs.length)];
    }

    String getSongs();

    enum Genre {
        JAZZ, CLASSIC, ROCK
    }
}