package day09_practice;

import java.util.Scanner;

public class Chalange {/*- Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
*/

    public static void main(String[] args) {

        Scanner imput=new Scanner(System.in);
        System.out.println("The product name is: ");
        String name= imput.next();
        System.out.println("the price is :");
        double price= imput.nextDouble();
        System.out.println("the quantaty is :");
        int quant=imput.nextInt();
        imput.nextLine();
        System.out.println("Enter yor name ");
        String fullname =imput.nextLine();

        System.out.println(fullname+" , your order for "+quant+" "+name+" has been placed . Your total is "+(quant*price));



    }
}
