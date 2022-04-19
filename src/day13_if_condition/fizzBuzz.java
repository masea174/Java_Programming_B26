package day13_if_condition;

import java.util.Scanner;

public class fizzBuzz {
    /*
    you willhave a number , bassed on the number you will have to print the visibility
    if the number is diviseble by 3print - Fizz
    if the number is divisible by 5 -Buzz
    if the number is divisible by both -FizzBuzz
    if the number is not divisible print just number
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Insert a number ");
        int number= input.nextInt();
        String message;


        if (number%5==0 && number%3==0){
            message="FizzBuzz";
        }else if (number%5==0){
            message="Buzz";
        }else if (number%3==0){
            message="Fizz";
        }else{ message=""+number;

    }
        System.out.println(message);
}}
