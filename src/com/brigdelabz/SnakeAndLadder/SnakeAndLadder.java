package com.brigdelabz.SnakeAndLadder;

public class SnakeAndLadder {
    static int START_POSITION = 0;
    static int PLAYER_POSITION = 0;
    private static int dieRoll() {
        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        return dieValue;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        System.out.println("Die : " +dieRoll());
    }
}

