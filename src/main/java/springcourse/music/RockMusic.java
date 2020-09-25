package springcourse.music;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSongs() {
        return "Wind cries Mary";
    }
}