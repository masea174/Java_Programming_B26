package day10_scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a number "  );
        int number=input.nextInt();
        boolean divis2=number%2==0;
        boolean divis3=number%3==0;
        boolean divis5=number%5==0;
        System.out.println(number+"Divisible by 2: "+divis2);
        System.out.println(number+"Divisible by 3: "+divis3);
        System.out.println(number+"Divisible by 5: "+divis5);


    }
}
