package day21_loops;

import java.util.Scanner;

public class MiddleChar {
    /*
        Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
    Ex:
    Input: elephant
    Output: The middle characters: ph

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the word");
        String word=input.next();
        int i =word.length()/2;
        if (word.length()%2==0){
            System.out.println(word.substring(i-1,i+1));
        }else{
            System.out.println(word.charAt(i));
        }


    }
}
