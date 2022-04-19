package day19_string;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner imput =new Scanner(System.in);
        System.out.println("please enter two words:");
        String word1= imput.next();
        String word2=imput.next();
        System.out.println("first word without first character:"+word1.substring(1));
        char letter=word2.charAt(0);
        int trim=word2.length()-1;
        System.out.println("second word without last character:"+word2.substring(0,trim));

    }
}
