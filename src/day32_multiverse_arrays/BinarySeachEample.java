package day_32_multiverse_arrays;

import java.util.Arrays;

public class BinarySeachEample {
    public static void main(String[] args) {
        int []a={4,10,30,100};
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,100));
        System.out.println(Arrays.binarySearch(a,200));//-5 because its looking for a element that will be placed in the order with a minus becouse it doesnt exist
        System.out.println(Arrays.binarySearch(a,6));//-2 becuse the position of 6 if it would of be present in this sorted array will be in position 1 so 1+1 =2 but becouse is not present it will be -
    }
}
