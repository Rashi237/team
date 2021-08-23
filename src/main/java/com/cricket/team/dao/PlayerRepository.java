package com.cricket.team.dao;

import com.cricket.team.model.Player;
import com.cricket.team.model.SelectionCriteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository {
    List<Player> getAllSelectedPlayer(SelectionCriteria selectionCriteria);
}
