package day24_loops;

import java.util.Scanner;
import java.util.SortedMap;

public class CountWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a phraze:");
        String str=input.nextLine().trim();
        int spases=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spases+=1;
            }
        }
        System.out.println("amount of words in the phraze is : " + (spases+1));
    }
}
