package com.blz_gambling_simulator;

public class Gambling_simulator {
    public static final int DAY_STAKE = 100;
    public static final int BET_PER_GAME = 1;
    public static final int RESIGNING_MARGIN = (DAY_STAKE / 100) * 50; // 50% of the stake
    public static final int WINNING_MARGIN = DAY_STAKE + RESIGNING_MARGIN;
    public static final int LOSING_MARGIN = DAY_STAKE - RESIGNING_MARGIN;
    public static final int MAXIMUM_DAY = 30;
    public static final int START_DOLLARS = 0;
    public static final int STAKES_PER_DAY = 50;

    public static void main(String[] args) {
        int totalCash = DAY_STAKE;
        int totalDollars = START_DOLLARS;
        int days = 1;

        for (days = 1; days <= MAXIMUM_DAY; days++) {
            while (totalCash < WINNING_MARGIN && totalCash > LOSING_MARGIN) {
                int game = (int) ((Math.random() * 10) % 2);
                if (game == 1) {
                    totalCash += BET_PER_GAME;
                } else {
                    totalCash -= BET_PER_GAME;
                }
            }
            if (totalCash == WINNING_MARGIN) {
                totalDollars += STAKES_PER_DAY;
                System.out.println("Gambler won " + totalDollars + " on Day " + days);
            } else {
                totalDollars -= STAKES_PER_DAY;
                System.out.println("Gambler lost " + totalDollars + "on Day " + days);
            }
        }
        if (totalDollars > START_DOLLARS) {
            System.out.println("Gambler won " + totalDollars);
        } else {
            System.out.println("Gambler lost " + totalDollars);
        }
    }
}