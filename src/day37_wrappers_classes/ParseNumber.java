package day37_wrappers_classes;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year ="2022";
//Concatenation
        System.out.println("year = " + year);
        System.out.println("Next year = " + (year+1));

        int numYear=Integer.parseInt(year);
        System.out.println("numYear = " + numYear);
        System.out.println("Next year  = " + (numYear+1));
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your message I am x years old");
        String s= input.nextLine();
        //in 5 years you will be that age;

        String agePart=s.split(" ")[2];
        int age=Integer.parseInt(agePart);
        System.out.println("In 5 years you will be " +(age+5)+" years old");



    }
}
