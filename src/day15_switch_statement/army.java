package day15_switch_statement;

import java.util.Scanner;

public class army {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please insert your age");
        int age= input.nextInt();
        System.out.println("Are you a USA citizen?");
        boolean isCitizen= input.nextBoolean();
        System.out.println("Are you are resident?");
        boolean resident= input.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean diploma=input.nextBoolean();

        if (isCitizen || resident) {
            if (age > 17 && age < 36) {
                if (diploma) {
                    System.out.println(" \"You are qualified to join the Army\"");
                }
            } else {
                System.out.println("your age must be between 18 and 35");
            }

        } else {
            System.out.println("You must be a citizen or a resident");
        }

        if ((isCitizen || resident) && diploma && (age > 17 && age < 36)) {
            System.out.println("you are qualified for the Army");
        } else {
            if (!(isCitizen || resident)) {
                System.out.println("you must be a citizen or resident");
            }
            if (!diploma) {
                System.out.println("you must have a high school diploma");
            }
            if (!(age > 17 && age < 36)) {
                System.out.println("you must be between 18 and 35 years old");
            }
        }
    }
}
