package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("What is today?" );
        String day= input.nextLine();

        System.out.println("Enter yor first name: ");
        String firstName= input.next();

        System.out.println("Enter last name : ");
        String lastName=input.next();
        input.nextLine();//the enter input freom thr line above is absorbed here
        System.out.println("What is your adress= " );
        String address= input.nextLine();
        System.out.println("Today = " + day);
        System.out.println(firstName+" "+lastName);




        System.out.println("address = " + address);
    }
}
