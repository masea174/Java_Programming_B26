package day11_practice;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please introduce the month number :");
        int month=input.nextInt();

        if(month==1 ||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("This month has 31 days.");
        }
        if(month==4||month==6||month==9||month==11){
            System.out.println("This month has 30 days.");
        }
        if (month==2){
            System.out.println("This month has 28 days.");
        }

    }
}
