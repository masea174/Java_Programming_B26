package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please introduce 3 words that need to be checked");
        String word=input.next().toLowerCase();
        String word1=input.next().toLowerCase();
        String word2=input.next().toLowerCase();
        int wl=word.length();
        int w1l=word1.length();
        int w2l=word2.length();
        String longestWord="";

        if(word.contains("a")&&word.length()>word1.length() &&word.length()>word2.length()){
            System.out.println(word+" is the biggest with a");
        }else if (word1.contains("a")&& w1l>wl && w1l>w2l){
            System.out.println(word1+" is biggest with a");

        }else if (word2.contains("a")&& w2l>wl &&w2l>w1l){
            System.out.println(word2 +" is biggest with a");
        } else {
            System.out.println("no words contains a");

        }
        if ((word.contains("a")&&(word.length()>longestWord.length()))){
            longestWord=word;
        }if ((word1.contains("a")&& (word1.length()>longestWord.length()))){
            longestWord=word1;
        }if (word2.contains("a") &&( word2.length()>longestWord.length())){
            longestWord=word2;

        }
        System.out.println(longestWord.isEmpty()? "No single largestword with a ": longestWord+" is the longest word with a");


    }
}
