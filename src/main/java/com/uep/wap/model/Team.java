package com.uep.wap.model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Teams")
public class Team {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long teamId;

        @ManyToMany
        @JoinColumn(name = "listOfTeams")
        private List<User> listOfMembers;




        @OneToMany(mappedBy = "assignedTeam", cascade = CascadeType.ALL)
        private Project project;


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

        public List<User> getListOfMembers() {
                return listOfMembers;
        }

        public void setListOfMembers(List<User> listOfMembers) {
                this.listOfMembers = listOfMembers;
        }

        public Project getProject() {
                return project;
        }

        public void setProject(Project project) {
                this.project = project;
        }

        public KanbanBoard getKanbanBoard() {
                return kanbanBoard;
        }

        public void setKanbanBoard(KanbanBoard kanbanBoard) {
                this.kanbanBoard = kanbanBoard;
        }

}
