package day24_practice;

import java.util.Scanner;

public class PrimeExemple {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter whole number: (1 - 999) ");
        int num = input.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < num; i++){

            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        System.out.println("\n---------RESULT----------");
        System.out.println(isPrime ? "prime" : "not prime");
    }
}
