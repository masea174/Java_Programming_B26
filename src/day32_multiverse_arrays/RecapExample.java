package day32_multiverse_arrays;

import java.util.Arrays;

public class RecapExample {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b =a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0]=100;
b[1]=200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();
        int []z=Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(z));
        z[0]=500;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(z));
    }
}
