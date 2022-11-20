package sportsstar;

import sports.OutdoorGame;

public class Footballer {
    OutdoorGame type;
    String name;
    String nationality;
    int goalsScored;
    int goalsSaved;
    double rating;

    public Footballer(OutdoorGame type, String name, String nationality, int goalsScored, int goalsSaved) {
        this.type = type;
        this.name = name;
        this.nationality = nationality;
        this.goalsSaved = goalsSaved;
        this.goalsScored = goalsScored;
    }

    void calculateRating(int goalsSaved,int goalsScored) {
        this.rating =  (goalsSaved + goalsScored) / 10;
    }

    void income(double rating) {
        System.out.println("Income is " + (rating * 10000));
    }
}
