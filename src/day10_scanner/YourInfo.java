package day10_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("what is your favorite book? ");
        String book= keyboard.nextLine();
        System.out.print("print your age:");
        byte age=keyboard.nextByte();
        System.out.print("your favorite number ? ");
        long  number= keyboard.nextLong();

        System.out.println(book);
        System.out.println(age);
        System.out.println(number);

    }
}
