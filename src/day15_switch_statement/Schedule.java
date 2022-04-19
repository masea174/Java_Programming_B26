package day15_switch_statement;

import java.util.Scanner;

public class Schedule {

    /*
    ask the user to say what day it is
    print the scheduale for that day and if there are office hours

     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Insert what day of the week is: ");
        String day = input.nextLine();
        String className = "";
        String teacher = "";
        String time = "";
        String message = "";


        switch (day){
            case "monday":
            case "mon":
                className = "Java";
                teacher = "Saim";
                time = "07-10pm";
                message = className + "  with " + teacher + " at " + time;
                break;
            case "Tue":
            case "tuesday":
            case "Tuesday":
            case "Wednesday":
            case "wed":
            case "wednsday":
                System.out.println("Ofice hours from 5:30 to 6:45");
                className = "Java";
                teacher = "Saim";
                time = "07-10pm ";
                message = className + "  with " + teacher + " at " + time;
                break;
            case "Thursday":
            case "thur":
            case "thursday":
                className = "SDET";
                teacher = "Nadir";
                time = "07-10pm";
                message = className + "  with " + teacher + " at " + time;
                break;
            case "Friday":
            case "fri":
            case "friday":
                message = "day off";
                break;
            case "sat":
            case "Saturday":
            case "saturday":
            case "Sunday":
            case "sun":
            case "sunday":
                message = "Full day of java with Saim from 10 am to 5pm";

        }
        System.out.println(message);
    }
}
