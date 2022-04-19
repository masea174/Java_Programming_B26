package day28_arrays;

import java.util.Arrays;

public class ArrayNumber {
    public static void main(String[] args) {
        /*
        1. Create an int array called numbers that has length of 100
2. Assign 1-100 to each index of the array. Then print your number array
         */
        int []num=new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i]=i+1;
        }
        System.out.println(Arrays.toString(num));
    }
}
