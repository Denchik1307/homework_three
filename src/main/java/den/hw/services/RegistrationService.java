package den.hw.services;

import den.hw.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final DataProcessingService dataProcessingService;
    private final UserService userService;
    private final NotificationService notificationService;

    @Autowired
    public RegistrationService(DataProcessingService dataProcessingService,
                               UserService userService,
                               NotificationService notificationService) {
        this.dataProcessingService = dataProcessingService;
        this.userService = userService;
        this.notificationService = notificationService;
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public UserService getUserService() {
        return userService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void processRegistration(User user) {
        dataProcessingService.addUserToList(user);
        notificationService.notifyUser(user);
    }
}
