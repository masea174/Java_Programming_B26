package day09_practice;

import java.util.Scanner;

public class AngleNumbers {

    /* Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
*/
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("Insert 3 angeled numbers:");
        float num1=imput.nextFloat();
        float num2=imput.nextFloat();
        float num3=imput.nextFloat();
        boolean triangle= (num1+num2+num3) ==180 ;
        System.out.println("does the angles make a triangle?"+ triangle);
        boolean circle =num1+num2+num3==360;
        System.out.println("can they build a circle : "+circle);

    }
}
