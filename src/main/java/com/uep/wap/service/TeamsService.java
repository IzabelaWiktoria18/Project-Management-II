package com.uep.wap.service;

import com.uep.wap.dto.TeamDTO;
import com.uep.wap.model.Team;
import com.uep.wap.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamsService {
    @Autowired
    private TeamRepository teamRepository;

    public void addTeam(TeamDTO teamDTO) {
        Team team = new Team();
        team.setKanbanBoard(teamDTO.getKanbanBoard());
        team.setProject(teamDTO.getProject());
        team.setListOfMembers(teamDTO.getListOfMembers());
        teamRepository.save(team);
        System.out.println("team added!");
    }

    public Iterable<Team> getAllTeams() {
        return teamRepository.findAll();
    }
    //get create update
}
