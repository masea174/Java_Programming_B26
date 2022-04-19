package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        ask the user to enter their first name and last name
        print the initials
         */
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first name");
        String name=input.nextLine().toUpperCase();
        System.out.println("enter the last name");
        String last=input.next().toUpperCase();
        System.out.println(name.charAt(0)+""+last.charAt(0));
    }}
