package com.uep.wap.model;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "KanbanBoard")
public class KanbanBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardId;

    @OneToOne
    @JoinColumn(name = "kanbanBoard")
    private Project projectName;


    @OneToMany(mappedBy = "kanbanBoard", cascade = CascadeType.ALL)
    private List<Team> listOfTeams;


    @OneToMany(mappedBy = "kanbanBoard", cascade = CascadeType.ALL)
    private List<Task> assignedTasks;

    public KanbanBoard() {
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void setProjectName(Project projectName) {
        this.projectName = projectName;
    }

    public void setListOfTeams(List<Team> listOfTeams) {
        this.listOfTeams = listOfTeams;
    }

    public void setAssignedTasks(List<Task> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    public long getBoardId() {
        return boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public Project getProjectName() {
        return projectName;
    }

    public List<Team> getListOfTeams() {
        return listOfTeams;
    }

    public List<Task> getAssignedTasks() {
        return assignedTasks;
    }

    private String boardName;


}
