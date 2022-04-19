package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class EmailCreation {
   /* Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
    If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.*/
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("please enter 2 words");
       String word1=input.next().toLowerCase();
       String word2=input.next().toLowerCase();

       if(word1.length()>5 && word2.length()>5){
           System.out.println(word1.substring(0,4)+word2.substring((word2.length()-3))+"@cybertek.com");
       }else {
           System.out.println("Invalid data");
       }
   }
}
