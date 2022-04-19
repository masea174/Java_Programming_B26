package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        /*
        Ask the user the month number their want print the month name
        user say 1- jan
        12-december;
        only valid numbers are , but as a challenge handle invalid numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("whitch number do you want");
        int number = input.nextInt();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (!(number >= 0 && number <= 12)) {
            System.out.println("wrong month number");
        } else{
                System.out.println(months[number - 1]);
            }

        }
    }
