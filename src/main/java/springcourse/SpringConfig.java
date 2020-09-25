package springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ResourceBundle;

@Configuration
public class SpringConfig {

    @Bean
    ResourceBundle bundleSongs() {
        return ResourceBundle.getBundle("songs");
    }
}
