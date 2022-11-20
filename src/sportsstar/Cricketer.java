package sportsstar;

import sports.OutdoorGame;

public class Cricketer {
    OutdoorGame type;
    String name;
    String nationality;
    double battingAverage;
    double bowlingAverage;
    double rating;

    public Cricketer (OutdoorGame type, String name, String nationality, double
            bowlingAverage, double battingAverage) {
        this.type = type;
        this.name = name;
        this.nationality = nationality;
        this.battingAverage = battingAverage;
        this.bowlingAverage = bowlingAverage;
    }

    void calculateRating(double battingAverage, double bowlingAverage) {
        this.rating = (battingAverage + bowlingAverage) / 10;
    }

    void income(double rating) {
        System.out.println("Income is " + (rating * 10000));
    }
}