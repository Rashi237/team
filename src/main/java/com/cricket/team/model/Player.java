package com.cricket.team.model;

public class Player {

    private int id;
    private String name;
    private String country;
    private String type;
    private double height;
    private double bmi;
    private int runs;
    private int wickets;
    private int stumpings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getStumpings() {
        return stumpings;
    }

    public void setStumpings(int stumpings) {
        this.stumpings = stumpings;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", height=" + height +
                ", bmi=" + bmi +
                ", runs=" + runs +
                ", wickets=" + wickets +
                ", stumpings=" + stumpings +
                '}';
    }
}
