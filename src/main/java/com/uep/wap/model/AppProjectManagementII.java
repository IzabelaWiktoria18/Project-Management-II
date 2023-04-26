package main.java.com.uep.wap.model;

import java.util.List;

public class AppProjectManagementII {
    @Id
    @Column(name = "app_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appId;

    @Column(name = "projects")
    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<Project> projects;

    @Column(name = "users")
    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<User> users;

    @Column(name = "notifications")
    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<Notification> notifications;




}
