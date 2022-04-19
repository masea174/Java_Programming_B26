package day32_multiverse_arrays;

import java.util.Arrays;

public class AddElement {
    /*
    an array
    make it bigger add a number to the end

     */
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        int []b = Arrays.copyOf(a,a.length+1);
        b[b.length-1]=100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
