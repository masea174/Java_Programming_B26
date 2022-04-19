package day11_practice;

import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("what timw it is: ");
        int time= input.nextInt();
        if (time>600 && time<1100){
            System.out.println("Good Morning");
        }
        if (time >1200 && time <1600 ){
            System.out.println("Good evening");
        }
        if(time>1700 && time<2300 ){
            System.out.println("Good night");
        }
    }
}
