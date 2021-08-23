package com.cricket.team.controller;

import com.cricket.team.model.SelectedTeam;
import com.cricket.team.model.SelectionCriteria;
import com.cricket.team.service.TeamSelectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
@RequestMapping("/api/cricket/")
public class CricketTeamController {
    @Autowired
    TeamSelectionService teamSelectionService;

    @RequestMapping(method = POST, path = "/team",
            produces = APPLICATION_JSON_VALUE,
            consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<SelectedTeam> createTeam(SelectionCriteria selectionCriteria) {
        ResponseEntity<SelectedTeam> response;
        SelectedTeam selectedTeam = null;
        try {
            if (null != selectionCriteria) {
                selectedTeam = teamSelectionService.selectedTeamPlayers(selectionCriteria);
            }
        } catch (Exception exception) {
            System.out.println("Exception in createTeam selection api " + exception);
        }
        response = ResponseEntity.ok(selectedTeam);
        return response;
    }
}
