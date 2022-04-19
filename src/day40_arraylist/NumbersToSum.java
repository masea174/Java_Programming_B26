package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersToSum {
    /*
    String numbers to sum
Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513” Output:
[ 6, 7, 9 ]
     */
    public static ArrayList<Integer>numbersToSum(ArrayList<String> list) {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int sums = 0;
            for (int j = 0; j < list.get(i).length(); j++) {
                sums += Integer.parseInt("" + list.get(i).charAt(j));
            }
            sum.add(i, sums);
        }  return sum;
        }

    public static void main(String[] args) {
        ArrayList<String> sum = new ArrayList<>(Arrays.asList("123","45","97"));
        System.out.println(numbersToSum(sum));
    }
    }