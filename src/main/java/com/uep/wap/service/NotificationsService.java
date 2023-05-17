package com.uep.wap.service;

import com.uep.wap.dto.NotificationDTO;
import com.uep.wap.model.Notification;
import com.uep.wap.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class NotificationsService {
    @Autowired
    private NotificationRepository notificationRepository;

    public void addNotification(NotificationDTO notificationDTO) {
        Notification notification = new Notification();
        notification.setNotificationName(notificationDTO.getNotificationName());
        notification.setApp(notificationDTO.getApp());
        notification.setUser(notificationDTO.getUser());
        notificationRepository.save(notification);
        System.out.println("calendar added!");
    }

    public Iterable<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
    //get create update
}
