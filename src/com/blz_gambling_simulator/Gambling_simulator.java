package com.blz_gambling_simulator;

public class Gambling_simulator {
    public static final int DAY_STAKE = 100;
    public static final int BET_PER_GAME = 1;

    public static void main(String[] args) {
        System.out.println("Initial day stake is " + DAY_STAKE + " And Bet per game is " + BET_PER_GAME);
        int totalCash = DAY_STAKE;
        int game = (int) ((Math.random() * 10) % 2);
        if (game == 1) {
            totalCash += BET_PER_GAME;
            System.out.println("Gambler won the bet : " + totalCash);
        } else {
            totalCash -= BET_PER_GAME;
            System.out.println("Gambler Lost the bet : " + totalCash);
        }

    }
}
