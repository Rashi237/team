package com.cricket.team.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName(value = "team")
@JsonPropertyOrder({"batsmen","bowlers","keepers"})
public class SelectedTeam {

    @JsonProperty(value = "batsmen", required = true)
    private List<Player> batsmen;
    @JsonProperty(value = "bowlers", required = true)
    private List<Player> bowlers;
    @JsonProperty(value = "keepers", required = true)
    private List<Player> keepers;

    public List<Player> getBatsmen() {
        return batsmen;
    }

    public void setBatsmen(List<Player> batsmen) {
        this.batsmen = batsmen;
    }

    public List<Player> getBowlers() {
        return bowlers;
    }

    public void setBowlers(List<Player> bowlers) {
        this.bowlers = bowlers;
    }

    public List<Player> getKeepers() {
        return keepers;
    }

    public void setKeepers(List<Player> keepers) {
        this.keepers = keepers;
    }

    @Override
    public String toString() {
        return "SelectedTeam{" +
                "batsmen=" + batsmen +
                ", bowlers=" + bowlers +
                ", keepers=" + keepers +
                '}';
    }
}
