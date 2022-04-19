package day11_practice;

import java.util.Scanner;

public class SalesVariable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sale amount ");
        double sales= input.nextDouble();
        if (sales<10000){
            System.out.println("Sorry no bonus this year");
        }
        if (sales>10000&&sales<15000){
            System.out.println("Bonus: 5000$");
        }
        if (sales>15_000){
            System.out.println("Bonus: 7000$");
        }
    }
}
