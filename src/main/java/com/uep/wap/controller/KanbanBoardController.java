package com.uep.wap.controller;

import com.uep.wap.dto.KanbanBoardDTO;
import com.uep.wap.dto.KanbanBoardsDataDTO;
import com.uep.wap.model.KanbanBoard;
import com.uep.wap.service.KanbanBoardsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class KanbanBoardController {

    private final KanbanBoardsService kanbanBoardsService;

    public KanbanBoardController(KanbanBoardsService kanbanBoardsService) {
        this.kanbanBoardsService = kanbanBoardsService;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/kanbanBoards")
    public Iterable<KanbanBoard> getAllKanbanBoards(){
        return kanbanBoardsService.getAllKanbanBoards();
    }

    @PostMapping(path = "/kanbanBoards")
    public String addKanbanBoards(@RequestBody KanbanBoardDTO kanbanBoardDTO){
        kanbanBoardsService.addKanbanBoard(kanbanBoardDTO);
        return "KanbanBoard added!";
    }
}
