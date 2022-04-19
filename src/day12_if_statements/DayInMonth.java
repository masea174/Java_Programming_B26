package day12_if_statements;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the month number :" );
        int month= input.nextInt();
        boolean has31Days=month==1||month==3||month==5||month==7||month==8||month==10||month==12;
        boolean has30Days=month==4||month==6||month==9||month==30;
        boolean  has28Days=month==2;



        if(has31Days){
            System.out.println("Has 31 Days");
        }
        if (has30Days){
            System.out.println("month has 30 days");
        }
        if(has28Days)
            System.out.println("month has 28 days");
        if(has31Days){
            System.out.println("Has 31 Days");
        }else if (has30Days){
            System.out.println("month has 30 days");
        }else if (has28Days) {
            System.out.println("month has 28 days");
        }else{
            System.out.println("Invalid number for month");
        }
    }
}
