package day_33_methods;

import java.util.Scanner;

public class Age {
    /*
    create a method that calculats and print the age
    takes the birth year as an input
     */
    public static void age(int input){
        int age= 2022-input;
        System.out.println(age);
    }

    public static void main(String[] args) {
        age(2000);
        int year=1993;
        age(year);
        Scanner input=new Scanner(System.in);
        System.out.println("What year you were born:");
        age(input.nextInt());
    }
}
