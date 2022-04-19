package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= 0;
        int max=-2147483648;
        int min=2147483647;
        while(a<5){
            System.out.println("Enter a number:");
            int n=input.nextInt();
            if(n<min){
                min=n;
            } if(n>max){
                max=n;
            }a++;
        }
        System.out.println(max+" - is the biggest number");
        System.out.println(min+" -is the smallest number");
    }
}
