package day29_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int[] reverse = new int[num.length];
//        for (int i = num.length-1 , j=0; i >= 0; i--,j++) {
//            reverse[j]=num[i];
//        }
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(reverse));

        for (int i = 0; i < num.length; i++) {
            reverse[num.length-1-i]=num[i];
        } System.out.println(Arrays.toString(num));
       System.out.println(Arrays.toString(reverse));
    }
}
