package day16_review;

import java.util.Scanner;

public class CharOperators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number one:");
        double numOne= input.nextDouble();
        System.out.println("Pick operators - + * % /");
        String operator= input.next();
        System.out.println("Enter number two");
        double numTwo= input.nextDouble();
        double result=0;
        boolean validcal=true;

        switch (operator) {
            case "+":
            case "plus":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*":
            case "x":
                result = numOne * numTwo;
                break;
            case "/":
            case ":":
                if
                (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("cannot divide by 0");
                    validcal = false;
                }
                break;
            case "%":
                if
                (numTwo != 0) {
                    result = numOne % numTwo;
                }else{
                    System.out.println("cannot take reminder of 0");
                    validcal=false;

                }break;
            default:
                System.out.println("Its not a valid opperator for calculator");
                validcal=false;
        }
        if(validcal)
        System.out.println(numOne+" "+operator+" "+numTwo+" = "+result+"");
    }
}
