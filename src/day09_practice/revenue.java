package day09_practice;

import java.util.Scanner;

public class revenue {

   // Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price

    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        System.out.println("write the product price:" );
        double price= imput.nextDouble();
        System.out.println("insert the quantaty: ");
        int quantaty=imput.nextInt();
        System.out.println("The revenue is : "+(price*quantaty));


    }
}
