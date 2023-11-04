package com.bridgeLabz;

//import java.util.Random;

public class SnakeAndLadderGame {

    public static void main(String[] args) {

        int playerPosition = 0;
        System.out.println("The starting player position is : "+playerPosition);

        // Random random = new Random(); // create object of random class

        while (playerPosition<100){
            // player rolls the dice
            // int rollsDice = random.nextInt(6)+1;
            int rollsDice = (int)(Math.random()*10)%6 +1;
            System.out.println("Player rolls the dice and getting number on dice is : "+rollsDice);

            // automatic generate situation to decide next step after rolling dice
            // int situation = random.nextInt(3);
            int situation = (int)(Math.random()*10)%3;

            //
            switch (situation){
                case 0:          // No play situation
                    System.out.println("Player 'no Play' situation.");
                    System.out.println("The current position of player is :"+playerPosition);
                    break;

                case 1:          // ladder situation
                    playerPosition += rollsDice;
                    System.out.println("After ladder situation,\nplayer position is:"+playerPosition);
                    break;

                case 2:          // Snakebite situation
                    playerPosition -= rollsDice;
                    
                    // if player position is less than 0 then player restart game
                    if(playerPosition<0){
                        playerPosition = 0;
                    }
                    System.out.println("After snake bite situation,\nplayer position is :"+playerPosition);
                    break;
            }
        }
    }
}
