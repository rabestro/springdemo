package springcourse;

import java.util.Random;

/**
 * @author Neil Alishev
 */
public interface Music {
    Random random = new Random();

    String getSongs();

    enum Genre {
        JAZZ, CLASSIC, ROCK
    }

    static String pickSong(final String[] songs) {
        return songs[random.nextInt(songs.length)];
    }
}