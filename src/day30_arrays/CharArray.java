package day30_arrays;

import java.util.Arrays;
import java.util.Locale;

public class CharArray {
    public static void main(String[] args) {
        char [] letters={'j','a','v','a'};
        String word="java";
char[] java=word.toCharArray();
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));
       // System.out.println(letters);
// print every letter in the string

        for(char eachChar:java){
            System.out.println(eachChar);
        }
    char [] day={'M','o','n','d','a','y'};
        System.out.println(day.length);
        String strDay=new String(day);
        System.out.println(strDay.toUpperCase());
       // System.out.println(day.toUpperCases);its a char so the String manipulations doesnt work
}}
