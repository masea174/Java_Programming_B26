package day11_practice;

import java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Introduce the pay rate:");
        double  pay= input.nextDouble();
        System.out.println("Introduce the numbers of hours worked");
        double hours= input.nextDouble();
        System.out.println("The net pay is: "+(pay*hours+hours%40*0.5*pay));
    }
}
