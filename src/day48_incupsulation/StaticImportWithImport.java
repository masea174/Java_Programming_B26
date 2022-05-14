package day48_incupsulation;

import java.util.Arrays;
import static java.util.Arrays.*;// this line imports all the startic members from the Arrays Class

import static java.lang.Math.*;

import static my_library.StringUtil.*;
public class StaticImportWithImport {
    public static void main(String[] args) {
        int[] a={4,12,5,25};
        sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(PI);

        System.out.println(abs(-1));

        System.out.println(camelCase("HEtrro Ia smmn"));

        System.out.println(reverseString("apple"));

    }
}
