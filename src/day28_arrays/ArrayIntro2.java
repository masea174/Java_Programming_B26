package day28_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        double [] arr=new double[4];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        arr[0]=30.99;
        System.out.println(Arrays.toString(arr));
        arr[1]=12.55;
        arr[2]=10.20;
        arr[3]=5;
        System.out.println(Arrays.toString(arr));

        // reasigning
        arr[2]=2000;
        System.out.println(Arrays.toString(arr));

        arr= new double[5];// this creates new arrays with 5 ellements and reasigns the arr reference to the new objects
        System.out.println(Arrays.toString(arr));
    }
}
