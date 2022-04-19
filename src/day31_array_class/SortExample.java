package day31_array_class;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {
        int[]nums={3,6,2,68,-2,24,32};
        int[]notSorted=nums;//there is not the second array object its only one object array created is just 2 different references there

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));
        //Max and min
        System.out.println("min "+nums[0]);
        System.out.println(("max ")+nums[nums.length-1]);

        String []arr={"Bb","ACV","ab","aCb"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(nums,-2));
    }
}
