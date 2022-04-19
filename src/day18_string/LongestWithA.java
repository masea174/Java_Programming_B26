package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    /*
    create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'
	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.

     */
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("please enter 3 words that need to be checked:");
        String word= imput.next(); word=word.toLowerCase();
        String word2= imput.next();word2=word2.toLowerCase();
        String word3= imput.next();word3=word3.toLowerCase();

        int a=word.length();
        int b=word2.length();
        int c=word3.length();

        boolean a1 = word.contains("a");
        System.out.println("what character you are looking for?");
        String chellenge = imput.next();
        boolean a2 = word.contains(chellenge);
        boolean b1 = word2.contains("a"), b2 = word2.contains(chellenge);
        boolean c1 = word3.contains("a"), c2 = word3.contains(chellenge);
        String message = " is bigger";
        if (a1 && a2) {
            if ((a >= b || !b1 || !b2)&&(a >=c || !c1 || !c2)) {
                System.out.println(word + message);
            }
        }
        if ((b1 && b2)) {
            if ((b >= a || !a1 || !a2)&&(b >= c || !c1 || !c2)){
                System.out.println(word2 + message);
            }}
        if (c1 && c2) {
            if ((c >= b || !b1 || !b2)&&(a <= c || !a1 || !a2))  {
                System.out.println(word3 + message);
            }
    }
}}
