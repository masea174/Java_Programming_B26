package day14_if_statements;

import java.util.Scanner;

public class BooleanVariablesATM {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Insert pin code :");
        int pin = input.nextInt();
        System.out.println("Insert last 4 of SSN:");
        int ssn = input.nextInt();
        String message;
        int expectedPin = 1552;
        int expectedSSN = 1234;
        boolean validPin = pin ==expectedPin;
        boolean validSSN =  ssn == expectedSSN;


        if (validPin && validSSN) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            if (!validPin) {
                System.out.println("Incorrect pin code");
            }
            if (!validSSN) {
                System.out.println("invalid ssn ");
            }
        }



    }}

