package com.uep.wap.service;

import com.uep.wap.dto.KanbanBoardDTO;
import com.uep.wap.model.KanbanBoard;
import com.uep.wap.repository.KanbanBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class KanbanBoardsService {
    @Autowired
    private KanbanBoardRepository kanbanBoardRepository;

    public void addKanbanBoard(KanbanBoardDTO kanbanBoardDTO) {
        KanbanBoard kanbanBoard = new KanbanBoard();
        kanbanBoard.setBoardName(kanbanBoardDTO.getBoardName());
        kanbanBoard.setAssignedTasks(kanbanBoardDTO.getAssignedTasks());
//        kanbanBoard.setListOfTeams(kanbanBoardDTO.getListOfTeams());
//        kanbanBoard.setProjectName(kanbanBoardDTO.getProjectName());
        kanbanBoardRepository.save(kanbanBoard);
        System.out.println("calendar added!");
    }

    public Iterable<KanbanBoard> getAllKanbanBoards() {
        return kanbanBoardRepository.findAll();
    }
    //get create update
}
