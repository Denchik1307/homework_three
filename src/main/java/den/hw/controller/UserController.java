package den.hw.controller;

import den.hw.domain.User;
import den.hw.services.DataProcessingService;
import den.hw.services.NotificationService;
import den.hw.services.RegistrationService;
import den.hw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    RegistrationService registrationService;

    @GetMapping
    public List<User> userList() {
        return registrationService.getDataProcessingService().getRepository().getUsers();
    }

    @PostMapping("/body")
    public void addUser(@RequestBody User user) {
        registrationService.processRegistration(user);
    }


}
