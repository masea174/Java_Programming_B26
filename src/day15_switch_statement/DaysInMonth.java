package day15_switch_statement;

import java.util.Scanner;

public class DaysInMonth {
    /*
    Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce the name of the month");
        String month= input.next();
        int num=0;
        switch (month){
            case "February":
                num=28;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                num=30;
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                num=31;
        }
        System.out.println(month+ " has "+num+" days.");
    }
}
