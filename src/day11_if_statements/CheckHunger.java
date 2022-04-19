package day11_if_statements;

import java.util.Scanner;
import java.util.SortedMap;

public class CheckHunger {
    public static void main(String[] args) {

        boolean hungry = true;

        if (hungry) {
            System.out.println("you are hungry I will get some food for you");
        } else {
            System.out.println("Than practice Java");
        }
        Scanner input = new Scanner(System.in);

        System.out.println("are you hungry?");
        boolean food= input.nextBoolean();
        if (food) {
            System.out.println("you are hungry I will get some food for you");
        } else {
            System.out.println("Than practice Java");


    }
}}