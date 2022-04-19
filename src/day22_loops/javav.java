package day22_loops;

import java.util.Scanner;

public class javav {
    public static void main(String[] args) {
  /*
  write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5

   */
        Scanner input=new Scanner(System.in);
        int bigger=0;
        int smaller=999999999;
        int iteration=0;
        System.out.println("introduce 5 numbers:");
        do {
           int  number= input.nextInt();
           if(number<=smaller){
               smaller=number;
           } else if (number>=bigger){
               bigger=number;
           }iteration++;
        }while (iteration<5);
        System.out.println("smallest = " + smaller);
        System.out.println("biggest = " + bigger);



    }
}
