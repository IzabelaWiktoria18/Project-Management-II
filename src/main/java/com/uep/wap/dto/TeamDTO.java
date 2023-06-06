package com.uep.wap.dto;

import com.uep.wap.model.KanbanBoard;
import com.uep.wap.model.Project;
import com.uep.wap.model._User;

import java.util.List;

public class TeamDTO {
    private List<_User> listOfMembers;

    private List<Project> project;

    private KanbanBoard kanbanBoard;

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
