package com.uep.wap.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String login;
    private String password;
    private String email;
    private String first_name;
    private String last_name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    )
    private Collection<Role> roles;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_projects",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "projectId", referencedColumnName = "projectId")
    )
    private List<Project> projectsForUser;

//    @ManyToOne
//    @JoinColumn(name = "teamId")
//    private Team team;
//
//    @OneToMany(mappedBy = "userForTask", cascade = CascadeType.ALL)
//    private List<Task> tasksForUser;

    public User(String login, String password, String email, String first_name, String last_name, Collection<Role> roles, List<Project> projects)
    {
        this.login = login;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.roles = roles;
        this.projectsForUser = projects;
    }

    public boolean isProjectManager(){
        String toCheck = "Project Manager";
        List<String> rolesNames = roles.stream().map(Role::getRole_name).toList();
        return rolesNames.contains(toCheck);
    }

    public boolean isClient(){
        String toCheck = "Client";
        List<String> rolesNames = roles.stream().map(Role::getRole_name).toList();
        return  rolesNames.contains(toCheck);
    }
}
