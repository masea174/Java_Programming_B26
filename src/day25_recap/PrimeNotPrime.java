package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class PrimeNotPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }


        }System.out.println(isPrime ? "is Prime" : "not Prime");

        String in="abcdef";
        char car=in.charAt(0);
        String b=""+car+(car+1);
        System.out.println(b);
    }
}