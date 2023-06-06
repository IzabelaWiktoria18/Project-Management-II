package com.uep.wap.controller;

import com.uep.wap.dto.TeamDTO;
import com.uep.wap.dto.TeamsDataDTO;
import com.uep.wap.model.Team;
import com.uep.wap.service.TeamsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TeamController {

    private final TeamsService teamsService;

    public TeamController(TeamsService teamsService) {
        this.teamsService = teamsService;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/teams")
    public Iterable<Team> getAllTeams(){
        return teamsService.getAllTeams();
    }

    @PostMapping(path = "/teams")
    public String addTeams(@RequestBody TeamDTO teamDTO){
        teamsService.addTeam(teamDTO);
        return "Teams added!";
    }
}
