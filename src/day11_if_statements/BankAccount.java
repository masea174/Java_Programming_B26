package day11_if_statements;

import java.util.Scanner;

public class BankAccount {/*Task: Hard code -> Dynamic

    Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over*/

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("please enter the account balance:");
        double balance= input.nextDouble();
        System.out.println("Enter the amount you want to withdraw:");
        double cash=input.nextDouble();
        balance=balance-cash;

        if (balance<0){
            System.out.println("Took too much money ,100$ overdraft applied ");
            System.out.println("Balance= $"+balance);
        }
            System.out.println("The balance left is: $"+balance);



    }
}
