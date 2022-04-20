package day48_incupsulation;

import my_library.StringUtil;

import java.util.Arrays;

public class StaticImportNorMAL {
    public static void main(String[] args) {
        int[] a={4,12,5,25};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Math.PI);//this is a static variable
        StringUtil.reverseString("Java");

    }
}
