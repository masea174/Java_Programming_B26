package day32_multiverse_arrays;

import java.util.Arrays;

public class MultiArrayExsmple {
    public static void main(String[] args) {
        int [] n={5,10,20,10};
        int[] m={5,10,100,39,19};
        int[][]all={n,m};
        System.out.println(all);
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all));
        System.out.println("first Array :"+Arrays.toString(all[0]));
        System.out.println("second array: "+Arrays.toString(all[1]));

        System.out.println();
        int [][] multi= {
                {90, 80, 70},
                {19, 51, 1129, 12},
                {10, 1900},
                {14}

        };
        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(multi[3].length);
    }
}
