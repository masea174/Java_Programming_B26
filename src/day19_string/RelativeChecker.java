package day19_string;

import java.util.Scanner;

public class RelativeChecker {
    /*
    Given two full names check if the two people are related. They will be considered to be related if they have the same last name
Ex:
Input:
Output: Related
Input:
James Bond
Alex Benji Output:
Not Related
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("plese enter the full name");
        String person1=input.nextLine().toUpperCase();
        System.out.println("please enter the first name of the second person :");
        String name2=input.nextLine().toUpperCase();
        System.out.println("please enter the last name of the second person:" );
        String lastname2=input.nextLine().toUpperCase();

        if (person1.contains(lastname2)){
            System.out.println("Related");
        }else {
            System.out.println("Not related");
        }
    }

}
