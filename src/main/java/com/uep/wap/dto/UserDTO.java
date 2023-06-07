package com.uep.wap.dto;

import com.uep.wap.model.Project;
import com.uep.wap.model.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO
{
    private String login;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private String role;
    private Long project;
    private List<Role> roles;
    private List<Project> projectsForUser;

    public UserDTO(){}
    public UserDTO(String login, String password, String email, String first_name, String last_name, String role, Long project)
    {
        this.login = login;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.project = project;
    }

//    public List<Role> getRoles() { return roles; }
//    public void setRoles(List<Role> roles) { this.roles = roles; }

}
