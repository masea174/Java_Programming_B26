package day33_methods;

import java.util.Locale;

public class Palindrome {
    /*
    create a method that will that will accept a String and find if it is
Palindrome or not
     */
    public static void polindrom(String s) {
        boolean isPalindrome = true;
        String s1=s;
        s = s.toLowerCase(Locale.ROOT).replace(" ", "");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
            }}
            System.out.println(isPalindrome ? s1+" it is polindrome" : s1+" not polindrome");

        }

    public static void main(String[] args) {
        polindrom("civic");
        polindrom("smart trams");
        polindrom( "never odd or even");
        polindrom("google");
    }
    }