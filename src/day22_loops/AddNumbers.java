package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sum=0;
        int i= 1;
        while (i<=5){
            System.out.println("enter "+i +" number");
            sum+=input.nextInt();

            i++;
        }
        System.out.println(sum
        );
    }
}
