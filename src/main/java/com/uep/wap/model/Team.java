package main.java.com.uep.wap.model;

import java.util.List;

@Entity
@Table(name = "Teams")
public class Team {

        @Id
        @Column(name = "team_id")
        private long teamId;

        @Column(name = "team_name")
        private String projectName;

        @Column(name = "list_of_members")
        private List<User> listOfMembers;
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "project")
        @JoinColumn(name = "project_id")
        @ManyToOne
        private Project project;

        @Column(name = "kanbanBoard")
        @JoinColumn(name = "board_id")
        @ManyToOne
        private KanbanBoard kanbanBoard;
}
