package day31_array_class;

import java.util.Arrays;

public class Anagram {
    /*
    2 strings find if they are anagram or not , characters are the same in both strings but order different

     */
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        char [] ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2)?"Yes they anagram":"No anagram");

    }
}
