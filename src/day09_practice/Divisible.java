package day09_practice;

import java.util.Scanner;

public class Divisible {
    /*sk the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true B*/

    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number= imput.nextInt();

        System.out.println("Is it divisible with 2 : "+(number%2==0));
        System.out.println("Is it divisible with 3 : "+(number%3==0));
        System.out.println("Is it divisible with 5 : "+(number%5==0));

    }
}
