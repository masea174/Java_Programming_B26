package day22_loops;

import java.util.Scanner;

public class GuessNumber {
    /*
    create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suggested = 398;
        int attempts = 0;
        int number = 0;
        do {
            System.out.println("Guess a number:");
            number = input.nextInt();
            if (number == suggested) {
                System.out.println("you guessed correctly");
            } else if (number > suggested) {
                System.out.println("too high");
            } else {
                System.out.println("too low");

            }
            attempts++;
        } while (number != suggested);
        System.out.println("it was " + attempts + " attempts to guess the right number");




    }
}
