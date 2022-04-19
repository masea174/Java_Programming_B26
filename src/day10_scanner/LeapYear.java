package day10_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("introduce a year: ");
        int year = input.nextInt();
        boolean isItLeapYear= year%4==0;
        boolean diviz100 = year%100==0;
        boolean diviz400= year%400 !=0;
        boolean statement=isItLeapYear && diviz100 && diviz400;
        System.out.println("Is it a leap year ?"+statement);

    }
}
