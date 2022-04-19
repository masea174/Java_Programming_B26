package day12_practice;

public class Calculator {/*
create a class Calculator

- do it without Scanner

declare and assign 2 number variables
declare and assign a char variable for an operator

create a calculator based on the operator picked
	+ : add num1 and num2
	- : minus num1 and num2
	* : multiply num1 and num2
	/ : divide num1 and num2
	any other char: "invalid operator"*/

    public static void main(String[] args) {
        double num1=6;
        double num2=9;
        char operator='7';

        if (operator == '+' ) {
            System.out.println(num1+"+"+num2+"="+(num1+num2));
        }else if (operator == '-') {
            System.out.println(num1+"-"+num2+"="+(num1-num2));
        }else if (operator == '*'){
            System.out.println(num1+"*"+num2+"="+(num1*num2)) ;
        }else if (operator == '/'){
            System.out.println(num1+"/"+num2+"="+(num1/num2));
        }else {
            System.out.println(" Invalid operator ");
        }

    }
}
