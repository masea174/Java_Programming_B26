package day20_strings;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter the firt name:");
        String name=s.next().trim().toLowerCase();
        System.out.println("enter last name:");
        String lastName=s.next().trim().toLowerCase();
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1));
        System.out.println(lastName.substring(0,1).toUpperCase()+lastName.substring(1));

    }
}
