package com.uep.wap.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "Teams")
public class Team {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long teamId;

        @ManyToMany
        @JoinColumn(name = "listOfTeams")
        private List<_User> listOfMembers;




        @OneToMany(mappedBy = "assignedTeam", cascade = CascadeType.ALL)
        private List<Project> project;


        @JoinColumn(name = "listOfTeams")
        @ManyToOne
        private KanbanBoard kanbanBoard;

        public Team() {
        }

        public long getTeamId() {
                return teamId;
        }

        public void setTeamId(long teamId) {
                this.teamId = teamId;
        }

        public List<_User> getListOfMembers() {
                return listOfMembers;
        }

        public void setListOfMembers(List<_User> listOfMembers) {
                this.listOfMembers = listOfMembers;
        }

        public List<Project> getProject() {
                return project;
        }

        public void setProject(List<Project> project) {
                this.project = project;
        }

        public KanbanBoard getKanbanBoard() {
                return kanbanBoard;
        }

        public void setKanbanBoard(KanbanBoard kanbanBoard) {
                this.kanbanBoard = kanbanBoard;
        }

}
