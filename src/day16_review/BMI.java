package day16_review;

import java.util.Scanner;

public class BMI {
    /*
BMI (Body Mass Index): Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values:
								All numbers taken as doubles


								—> BMI Formula: BMI = mass / height^2
								—> Values:

									Less than 18.5 — Underweight
									From 18.5 to 25 — Normal weight
									From 25 to 30 — Overweight
									More than or equal to 30 — Obese

								 	Output :  Underweigth    or    Normal weight    or   etc.
						 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight kg :");
        double weight= input.nextDouble();
        System.out.println("Enter the height,m : ");
        double height= input.nextDouble();
        double bMI=weight/(height*height);
        String message=bMI+",that's -";

        if (bMI<18.5){
            message+="underweight";
        }else if(bMI>=18.5 && bMI<=25){
            message+="Normal weight";
        }else if(bMI>25 &&bMI< 30){
            message+="Overweight";
        }else{
            message+="Obese";
        }
        System.out.println(message);
}}



