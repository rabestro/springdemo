package springcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        final var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final var computer = context.getBean("computer", Computer.class);

        computer.run();

        context.close();
    }
}
