package day09_practice;

import java.util.Scanner;
/*Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs
*/

public class Book {

    public static void main(String[] args) {

        Scanner imput= new Scanner(System.in);

        System.out.println("insert yor age: ");
        byte age=imput.nextByte();
        System.out.println("enter your favorite number: ");
        long number= imput.nextLong();
        System.out.println("Your favorite book: ");
        String book=imput.next();
        System.out.println("age = " + age);
        System.out.println("book = " + book);
        System.out.println("number = " + number);


    }
}
