package com.appdev.teamname.espelitag6.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameID;

    private String badgeName;
    private String goalDescription;
    private String goalTarget;
    private Double progressRate;
    private String achievementStatus;
    private LocalDateTime dateEarned;

    // Getters and Setters
    public Long getGameID() {
        return gameID;
    }

    public void setGameID(Long gameID) {
        this.gameID = gameID;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public String getGoalTarget() {
        return goalTarget;
    }

    public void setGoalTarget(String goalTarget) {
        this.goalTarget = goalTarget;
    }

    public Double getProgressRate() {
        return progressRate;
    }

    public void setProgressRate(Double progressRate) {
        this.progressRate = progressRate;
    }

    public String getAchievementStatus() {
        return achievementStatus;
    }

    public void setAchievementStatus(String achievementStatus) {
        this.achievementStatus = achievementStatus;
    }

    public LocalDateTime getDateEarned() {
        return dateEarned;
    }

    public void setDateEarned(LocalDateTime dateEarned) {
        this.dateEarned = dateEarned;
    }
}

