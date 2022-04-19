package day22_loops;

import day16_review.SoccerGame;

public class DoWhileExple {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println(i);;
            i++;
        }while (i<=10);
        int i2=0;
        System.out.println("false boolean");
        do{
            System.out.println(i2);;
            i2++;
        }while (i2==10);

        System.out.println("while loop");

        int i3 =0;
        while (i3==10)
            System.out.println(i);;
            i3++;

}}
