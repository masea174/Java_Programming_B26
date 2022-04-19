package day24_practice;

import java.util.Random;

public class UniqRandomNumber {
    /*
    Generate a random number that is six digits long. Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random class in java
     */
    public static void main(String[] args) {
        Random input = new Random();
        String number = "";
        int i = 0;
        while (i < 100) {
            int a = input.nextInt(9);
            if (!(number.contains("" + a))) {
                number += a;
            }
            i++;
            if (number.length() == 6) {
                break;
            }
        }
        System.out.println("number is " + number);
    }
}

