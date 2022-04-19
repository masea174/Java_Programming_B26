package day09_scanner;

import java.util.Scanner;

public class WorkStaus {
   /* create Scanner object
    ask the user to enter their first name next
            ask the user to enter the flast name next
            ask if they are employeed  boolean
    ask the user if they are students*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your first name :");
        String name=input.next();
        System.out.println(name);
        System.out.println("please rnter your last name :");
        String lastname=input.next();
        System.out.println(lastname);
        System.out.println("are you employeed");
        boolean areYouEmployeed=input.nextBoolean();
        System.out.println("areYouEmployeed = " + areYouEmployeed);
        System.out.println("Student?");
        boolean areYouStudent= input.nextBoolean();
        System.out.println("areYouStudent = " + areYouStudent);

        System.out.println(name+" "+lastname+"are they employed ?"+areYouEmployeed+"are you a student ?"+areYouStudent);
    }
}
