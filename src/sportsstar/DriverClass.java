package sportsstar;

import sports.*;
import sports.OutdoorGame;

public class DriverClass {
    public static void main(String[] args) {
        OutdoorGame Cricket = new Cricket();
        Cricketer c1 = new Cricketer(Cricket, "Sonu","Indian",3.5,8.5 );
        c1.calculateRating(c1.battingAverage, c1.bowlingAverage);
        System.out.println(c1.rating);
        c1.income(c1.rating);

        OutdoorGame Football = new Football();
        Footballer f1 = new Footballer(Football, "John", "Spain", 10, 0);
        f1.calculateRating(f1.goalsSaved,f1.goalsScored);
        System.out.println(f1.rating);
        f1.income(f1.rating);
    }
}
