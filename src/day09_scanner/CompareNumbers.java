package day09_scanner;
import java.util.Scanner;

public class CompareNumbers {
    /* create a scanner objects
    ask users to enter 2 numbers
    ckeck if they are equal to each other

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("please create 2 numbers :");
        int number1=input.nextInt();
        System.out.println("This is your number 1 "+number1);
        int number2=input.nextInt();

        System.out.println("This is your number 2 "+number2);
        System.out.println("The numbers are equal "+(number1==number2));
    }
}
