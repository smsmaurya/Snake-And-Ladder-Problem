package com.bridgeLabz;

public class SnakeAndLadderGame {

    public static void main(String[] args) {
        System.out.println(" Start Snake and ladder game");
        int playerPosition = 0;
        System.out.println("The player position is : "+playerPosition);

        int rollsDice = (int)(Math.random()*10)%6 +1;
        System.out.println("Player rolls the dice and getting number on dice is : "+rollsDice);

    }
}
