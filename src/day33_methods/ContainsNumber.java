package day33_methods;

import java.util.Arrays;

public class ContainsNumber {
    public static void containsNumber(int []a, int b){
        Arrays.sort(a);
       int c= Arrays.binarySearch(a,b);
        System.out.println(c>=0?"True":"False");
    }

    public static void main(String[] args) {
        int []a={123,2,3,4};
        int b=3;
        containsNumber(a,b);
        int c=12;
        containsNumber(a,c);
    }
}
