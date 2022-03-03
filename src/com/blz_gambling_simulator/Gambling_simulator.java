package com.blz_gambling_simulator;

public class Gambling_simulator {
    public static final int DAY_STAKE = 100;
    public static final int BET_PER_GAME = 1;
    public static final int RESIGNING_MARGIN = (DAY_STAKE / 100) * 50; // 50% of the stake
    public static final int WINNING_MARGIN = DAY_STAKE + RESIGNING_MARGIN;
    public static final int LOSING_MARGIN = DAY_STAKE - RESIGNING_MARGIN;

    public static void main(String[] args) {
        System.out.println("Initial day stake is " + DAY_STAKE + " And Bet per game is " + BET_PER_GAME);
        int totalCash = DAY_STAKE;
        while (totalCash < WINNING_MARGIN && totalCash > LOSING_MARGIN) {
            int game = (int) ((Math.random() * 10) % 2);
            if (game == 1) {
                totalCash += BET_PER_GAME;
            } else {
                totalCash -= BET_PER_GAME;
            }
        }
        if (totalCash == WINNING_MARGIN) {
            System.out.println("Gambler won " + totalCash);
        } else {
            System.out.println("Gambler lost " + totalCash);
        }
    }
}
