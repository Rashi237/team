package com.cricket.team.service;

import com.cricket.team.model.SelectedTeam;
import com.cricket.team.model.SelectionCriteria;

public interface TeamSelectionService {
    SelectedTeam selectedTeamPlayers(SelectionCriteria selectionCriteria);
}
