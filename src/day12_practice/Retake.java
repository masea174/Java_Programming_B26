package day12_practice;

import java.util.Scanner;

public class Retake {/*
create a class Retake

declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade
*/

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please insert the grade:");
        int grade = input.nextInt();
        System.out.println("Please introduce the number of attempt:");
        int attempt= input.nextInt();

        if (attempt==1){
            System.out.println("The final grade is : "+grade*0.9);
        }else if(attempt==2){
            System.out.println("The final grade is : "+grade*0.8);
        }else if(attempt==3){
            System.out.println("The final grade is : "+grade*0.65);
        }
    }
}
