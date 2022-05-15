package day57_exeptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        try {
            System.out.println("Enter a number 1");
            int num = input.nextInt();
            System.out.println("Enter number 2");
            int num2 =input.nextInt();
            System.out.println(num/num2);

        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println();
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finaly block");
            input.close();
        }
        System.out.println("Done");
    }

}
