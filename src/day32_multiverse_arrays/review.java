package day32_multiverse_arrays;

import java.util.Arrays;

public class review {
    public static void main(String[] args) {
        String [] words={"hello","java","Saturday"};
        System.out.println(String.join(" #### ",words));
        String str="Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
