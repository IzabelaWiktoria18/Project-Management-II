package com.uep.wap.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "teams")
public class Team {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long teamId;

//        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//        @JoinTable(
//                name = "teams_users",
//                joinColumns = @JoinColumn(name = "teamId", referencedColumnName = "teamId"),
//                inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id")
//        )

        @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
        private List<User> users;


        @OneToMany(mappedBy = "projectTeam", cascade = CascadeType.ALL)
        private List<Project> projects;

        private String teamName;


//        @OneToMany(mappedBy = "assignedTeam", cascade = CascadeType.ALL)
//        private List<Project> project;


//        @JoinColumn(name = "listOfTeams")
//        @ManyToOne
//        private KanbanBoard kanbanBoard;


//        public long getTeamId() {
//                return teamId;
//        }
//
//        public void setTeamId(long teamId) {
//                this.teamId = teamId;
//        }
//
//        public List<_User> getListOfMembers() {
//                return listOfMembers;
//        }
//
//        public void setListOfMembers(List<_User> listOfMembers) {
//                this.listOfMembers = listOfMembers;
//        }

//        public List<Project> getProject() {
//                return project;
//        }

//        public void setProject(List<Project> project) {
//                this.project = project;
//        }

//        public KanbanBoard getKanbanBoard() {
//                return kanbanBoard;
//        }
//
//        public void setKanbanBoard(KanbanBoard kanbanBoard) {
//                this.kanbanBoard = kanbanBoard;
//        }

}
