package main.java.com.uep.wap.model;

import java.util.List;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id")
    private long UserId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_surname")
    private String userSurname;

    @Column(name = "user_role")
    private String userRole;

    @Column(name = "e-mail")
    private String eMail;

    @Column(name = "list_of_notifications")
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Notification> listOfNotifications;

    @Column(name = "dashboards")
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Dashboard> dashboards;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @OneToOne
    @JoinColumn(name = "app_id")
    @Column(name = "app")
    private AppProjectManagementII app;

    @OneToOne(mappedBy = "calendar_user", cascade = CascadeType.ALL)
    private Calendar calendar;

    @OneToOne
    @JoinColumn(name = "assigned_user")
    @Column(name = "task")
    private Task task;
}
