package day_33_methods;

import java.util.Scanner;

public class CountNumbers {
    /*
    count yp to a certan number
    start from 0 and print all the numbers until the number input

     */
    public static void countNumbers(int  num){
        for (int i = 0; i <=num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        countNumbers(9);
        countNumbers(27);
        Scanner input=new Scanner(System.in);
        countNumbers(input.nextInt());

    }
}
