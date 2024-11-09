package den.hw.services;

import den.hw.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(String name, int age, String email) {
        User user = new User(name, age, email);
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        return user;
    }


}
