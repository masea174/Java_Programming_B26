package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        int num1,num2,num3;

        Scanner input=new Scanner(System.in);
        System.out.println("introduce 3 numbers");
        num1= input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+"is the biggest.");
        }else if(num2>=num1 && num2>=num3) {
            System.out.println(num2 + " is the biggest.");
        }else {
            System.out.println(num3 +"is the biggest");
    }
}}
