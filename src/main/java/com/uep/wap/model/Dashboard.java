package main.java.com.uep.wap.model;

import java.util.List;

@Entity
@Table(name = "Dashboards")
public class Dashboard {
    @Id
    @Column(name = "dashboard_id")
    private long dashboardId;

    @Column(name = "dashboard_name")
    private String dashboardName;

    @Column(name = "projects")
    private List<Project> projects;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(name = "user")
    private User user;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
