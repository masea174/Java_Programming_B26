package day16_review;

import java.util.Scanner;

public class SwitchPractice {
    /*
create a class Retake

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%

     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What was the grade?");
        int grade= input.nextInt();
        System.out.println("Which attempt number is it?");
        int attempt= input.nextInt();
        String message="";
        boolean statement=true;
        if (attempt==1){
            grade-=(int)(0.1*grade);
        }else if(attempt==2){
            grade-=(int)(0.2*grade);
        }else if(attempt==3){
            grade-=(int)(0.35*grade);

        }else {
            System.out.println("not valid attemt number");
            statement=false;
        }if (statement){
            System.out.println( "the final grade is "+grade);
        }

    }
}
