package day09_practice;

import java.util.Scanner;

public class LeapYear {
    /*create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4. Print true or false.

Hint: use remainder operator */

    public static void main(String[] args) {

        Scanner imput=new Scanner(System.in);

        System.out.println("please ente a year :");
        int year= imput.nextInt();
        System.out.println("Is the year leap? "+(year%4==0));

    }
}
