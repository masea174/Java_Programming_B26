package day23_loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int suggested= 80;
        int number;
        int iteration=0;
        do {
            System.out.println("please enter a number:");
            number=input.nextInt();
            if (number>suggested){
                System.out.println("too high");
            }else if (number<suggested){
                System.out.println("too low");
            }else if (number==suggested){
                System.out.println("Nice guess");
            }iteration++;
        }while(suggested!=number);
        System.out.println("you guessed "+number+" in "+iteration+" guesses");
    }
}
