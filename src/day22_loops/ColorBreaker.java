package day22_loops;

import java.util.Scanner;

public class ColorBreaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors="";

        while (colorsPicked < 3) {
            System.out.println("Pick a color");
            String color = input.next();
            if (uniqueColors.contains(color)) {
                System.out.println("You already picked that color");
            } else {
                colorsPicked++;
                uniqueColors += color + " ";
            }
        }
        System.out.println(uniqueColors);
    }
}
