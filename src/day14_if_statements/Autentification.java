package day14_if_statements;

import java.util.Scanner;

public class Autentification {/*
inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Insert pin code :");
        int pin= input.nextInt();
        System.out.println("Insert last 4 of SSN:");
        int ssn=input.nextInt();
        String message;

        if (pin==1552 && ssn==1234){
            message="Authentication successful";
        }else if(pin!=1552 && ssn==1234){
            message="Incorrect pin code";
        } else if(pin==1552 && ssn!=1234){
            message="invalid ssn ";
        }else {
            message="Authentication failed";
        }
        System.out.println(message);

        if (pin==1552 && ssn==1234){
            System.out.println("authentication successful");
        }else{
            System.out.println("Authentication failed");
            if(pin!=1552){
                System.out.println("incorrect pin");
            }if(ssn!=1234)
                System.out.println("invalid ssn");
        }
    }}
