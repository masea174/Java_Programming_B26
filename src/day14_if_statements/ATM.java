package day14_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to atm \n Please Insert your card and enter your pin code");
        int pinCode = input.nextInt();

        int expectedPin = 2342;

        if (pinCode == expectedPin) {
            System.out.println("Logged in");
            System.out.println("Select a number :");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Withdraw ");
            System.out.println("\t3) Deposit");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Your balance is :$ 1988087");
            } else if (option == 2) {
                System.out.println("How much do you want to withdraw?");
                int money = input.nextInt();
                System.out.println("Withdrawing: " + money);
            } else if (option == 3) {
                System.out.println("Please insert the money in the cash pocket");
            } else {
                System.out.println("Invalid selection.Exiting account");}


            }else {
                System.out.println("This is a invalid pin .Please try again");
            }

        }
    }

