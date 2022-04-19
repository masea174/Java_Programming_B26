package day11_practice;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Introduce 2 numbers: ");
        int num1= input.nextInt(),
                num2= input.nextInt();
        if(num1>num2){
            System.out.println(num1+ " is bigger than "+num2);
        }else {
            System.out.println(num2+" is bigger than "+num1);

        }

    }
}
