package day10_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("please enter 3 numbers" );
        double angle1= imput.nextDouble(),
                angle2= imput.nextDouble(),
                angle3= imput.nextDouble(),
                sum=angle1+angle2+angle3;
        boolean triangle= sum==180;
        boolean circle =sum==360;
        System.out.println("Do my angles build a triangle: "+triangle );
        System.out.println("Do my angles build a circle : "+circle);

    }
}