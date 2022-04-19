package day09_practice;

import java.util.Scanner;

public class RateCalculator {
    /* rite a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
*/
    public static void main(String[] args) {

        Scanner imput=new Scanner(System.in);

        System.out.println("Please enter your salary: ");
        double salary=imput.nextDouble();
        System.out.println("Plase enter the number of hours worked per week:");
        int hours = imput.nextInt();
        System.out.println("The hourly rate is : "+ (salary/(hours*52)));
    }
}
