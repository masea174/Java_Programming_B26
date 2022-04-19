package day24_practice;

import java.util.Scanner;

public class MultiplyEnd {
    /*
    Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word=input.next();
        System.out.println("enter a number");
        int number=input.nextInt();
        for(int i=0;i<number;i++){
            word+=word.substring(word.length()-1,word.length());
        }
        System.out.println(word);
    }
}
