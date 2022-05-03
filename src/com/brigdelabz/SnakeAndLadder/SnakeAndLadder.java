package com.brigdelabz.SnakeAndLadder;

public class SnakeAndLadder {
    static int START_POSITION = 0;
    static int PLAYER_POSITION = 0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    private static int dieRoll() {
        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        return dieValue;
    }

    private static int getoption() {
        int option = (int) (Math.random() * 10 % 3) + 1;
        return option;
    }
    private static int playgame(int option, int dieValue) {
        switch (option) {
            case NO_PLAY:
                System.out.println("No Play");
                break;
            case LADDER:
                PLAYER_POSITION = PLAYER_POSITION + dieValue;
                break;
            case SNAKE:
                if(PLAYER_POSITION-dieValue <START_POSITION)
                {
                    PLAYER_POSITION=START_POSITION;
                }
                else{
                    PLAYER_POSITION = PLAYER_POSITION - dieValue;
                }

        }

        return PLAYER_POSITION;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        int dieNo = dieRoll();
        int option = getoption();
        System.out.println("Die : " +dieNo);
        System.out.println("Option : "+option);
        PLAYER_POSITION= playgame(option, dieNo);
        System.out.println("Playerposition is " +PLAYER_POSITION );

    }
}

