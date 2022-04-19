package day41_arraylist;

import java.util.Scanner;

public class classBty {
    public static void main(String [] args) {
        System.out.println(countN(98765));
/*  s
Create a function that will count the number of digits of a number. Conversion of the number to a string is not allowed,
digitsCount(4666) ➞ 4

digitsCount(544) ➞ 3

digitsCount(121317) ➞ 6

digitsCount(0) ➞ 1

 */  }public static int countN(int n){


       int count=0;

        while(n>0){

            n/=10;
            //number=number/10;

            count++;

            // Math class -- has pow method

        }return count ;}}
