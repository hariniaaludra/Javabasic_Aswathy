package com.udemy.abstraction;

public class AthleteApp {

    public static void main(String[] args) {
        BasketBallPlayer kobe = new BasketBallPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(25.5);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BasketBallPlayer[] basketballPlayers = new BasketBallPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        for (BasketBallPlayer basketballPlayer : basketballPlayers) {
            System.out.println("-------------------------------------");
            basketballPlayer.compete();
            System.out.println("-------------------------------------");
            basketballPlayer.getBio();
            System.out.println(basketballPlayer.getBodyType());
        }

        FootBallPlayer tom = new FootBallPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootBallPlayer ed = new FootBallPlayer("Ed Brady", "Ed Terrific", 1979, "New England Patriots", 265, 8988, 4377);
        ed.setTeam("Tampa Bay");

        FootBallPlayer[] footballPlayers = new FootBallPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for (FootBallPlayer footballPlayer : footballPlayers) {
            System.out.println("-------------------------------------");
            footballPlayer.compete();
            System.out.println("-------------------------------------");
            footballPlayer.getBio();
            System.out.println(footballPlayer.getBodyType());
        }

        Swimmer katinka = new Swimmer("Katinka Hosszu", "Iron lady", 1989, "Team Iron", 542, 845);
        System.out.println("-------------------------------------");
        katinka.compete();
        System.out.println("-------------------------------------");
        katinka.getBio();
        System.out.println(katinka.getBodyType());
    }
}