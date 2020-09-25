package springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
    @Value("${userBean.name}")
    private String name;

    public String getName() {
        return name;
    }

}