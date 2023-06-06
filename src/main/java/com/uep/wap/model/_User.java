package com.uep.wap.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Users")
public class _User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String login;
    private String password;
    private String email;
    private String first_name;
    private String last_name;

    public _User(String login, String password, String email, String first_name, String last_name)
    {
        this.login = login;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Notification> listOfNotifications;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Dashboard> dashboards;


    @ManyToOne
    @JoinColumn(name = "users")
    //TODO nwm czemu krzyczy
    private AppProjectManagementII app;

    @OneToOne(mappedBy = "calendarUser", cascade = CascadeType.ALL)
    private Calendar calendar;

    @OneToOne
    @JoinColumn(name = "assignedUser")
    private Task task;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "listOfMembers")
    private List<Team> listOfTeams;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usersList")
    private List<Team> listOfProjects;
}
