package day25_recap;

import java.util.Random;

public class random {
    public static void main(String[] args) {
         Random random = new java.util.Random();
    String number = "";
    int count = 0;

        while (count < 6) {

        String num = "" + random.nextInt(10);

        if (!number.contains(num)) {

            number += num;
            count++;

        }
    }

        System.out.println("number = " + number);
}}
