package day28_arrays;

import java.util.Arrays;

public class ReverseArrays {
    /*
    Reverse Array
Write a program that will reverse the order of any given array
Ex: Input:
[1, 2, 3, 4, 5] Output:
[5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,8};
        int j=0;
        int[] reverse=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            reverse[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
