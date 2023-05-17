package com.uep.wap.dto;

import com.uep.wap.model.KanbanBoard;

import java.util.List;

public class KanbanBoardsDataDTO {
    List<KanbanBoardDTO> kanbanBoards;

    public List<KanbanBoardDTO> getKanbanBoards() {
        return kanbanBoards;
    }

    public void setKanbanBoards(List<KanbanBoardDTO> kanbanBoards) {
        this.kanbanBoards = kanbanBoards;
    }
}
