package day09_practice;

import java.util.Scanner;

public class OddNumber {
    /*Ask the user to enter an int number. Determine if the number is even or odd
Print a boolean for both even and odd*/

    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("please entre a number: ");
        int number=imput.nextInt();
        System.out.println("Is the number even? "+(number%2==0));
        System.out.println("Is the number odd? "+(number%2!=0));
    }

}
