package main.java.com.uep.wap.model;

@Entity
@Table(name = "Notifications")
public class Notification {
    @Id
    @Column(name = "notification_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notificationId;

    @Column(name = "notification_name")
    private String notificationName;


    @ManyToOne
    @JoinColumn(name = "app_id")
    @Column(name = "app")
    private AppProjectManagementII app;

    @ManyToOne
    @JoinColumn(name = "list_of_notifications")
    @Column(name = "user")
    private User user;


}
