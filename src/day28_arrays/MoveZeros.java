package day28_arrays;

import java.util.Arrays;

public class MoveZeros {
    /*
    Move Zeros
Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
Ex: Input:
[10, 0, 5, 0, 1, 0] Output:
[10, 5, 1, 0, 0, 0]
     */
    public static void main(String[] args) {
        int[] arr={10,0,5,0,1,0};
        int a=0;
        int[ ]arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr2[arr.length-1]=arr[i];
            }else {arr2[a]=arr[i];
            a++;}
        }
        System.out.println(Arrays.toString(arr2));

    }
}
