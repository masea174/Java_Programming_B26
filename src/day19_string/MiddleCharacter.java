package day19_string;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the word need to be checked for middle characters:");
        String word=input.next();
        int l=word.length();
        int a=l/2;

        if (l%2==0){
            System.out.println("middle of "+word+" is: "+word.substring(a-1,a+1));
        }else{
            System.out.println("middle of "+word+" is: "+word.substring(a,a+1));

        }
    }
}
