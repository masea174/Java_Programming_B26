package day31_array_class;

import java.util.Arrays;

public class EqualSample {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[]b={1,2,3};
        System.out.println(a==b);//checks for the location
        System.out.println(Arrays.equals(a,b));
        int []d={3,2,1};
        System.out.println(Arrays.equals(a,d));
    }
}
