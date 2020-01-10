package com.company;
import java.util.Random;
import java.util.Scanner;
/*
 *Project: Number guessing game
 *Author: jhwang37
 *Date: 1/10/2019
 */

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tries = 0;// setting tries to 0 to increment in the loop
        boolean win = false;
        int guess = 0;


        System.out.println("Welcome to the random number guessing game!");
        System.out.println("Enter the max number you would like to guess from '0' (0 - Your Number");
        int maxNum = sc.nextInt();
        int target = rand.nextInt(maxNum);//user input for max number they would like to guess to from 0

        while (win == false) {//Loops until win no longer is equal to false
            System.out.println("Enter a number 1-10: ");
            guess = sc.nextInt();
            tries++;//incrementing tries

            if (guess == target) { //Guess is compared to the target number, if it is equal, loop will exit
                win = true;
            } else if (guess < target) {//Guess is compared using the less than operator.
                System.out.println("The number is higher");
            } else if (guess > target) {//Guess is compared using the greater than operator.
                System.out.println("The number is lower");
            }
        }

        System.out.println("Congrats you won! ");//Outside of loop meaning user won. Also displays number of tries it took.
        System.out.println("It took you " + tries + " tries");
    }
}




