package com.uep.wap.controller;

import com.uep.wap.dto.NotificationDTO;
import com.uep.wap.dto.NotificationsDataDTO;
import com.uep.wap.model.Notification;
import com.uep.wap.service.NotificationsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class NotificationController {

    private final NotificationsService notificationsService;

    public NotificationController(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/notifications")
    public Iterable<Notification> getAllNotifications(){
        return notificationsService.getAllNotifications();
    }

    @PostMapping(path = "/notifications")
    public String addNotifications(@RequestBody NotificationDTO notificationDTO){
        notificationsService.addNotification(notificationDTO);
        return "Notifications added!";
    }
}
