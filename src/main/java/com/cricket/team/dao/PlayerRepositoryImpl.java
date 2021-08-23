package com.cricket.team.dao;

import com.cricket.team.model.Player;
import com.cricket.team.model.SelectionCriteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class PlayerRepositoryImpl implements PlayerRepository {
    @Override
    public List<Player> getAllSelectedPlayer(SelectionCriteria selectionCriteria) {
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/testdb",
                            "postgres", "123");
            //call stored procedure for creating database and inserting data

            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

