package day20_strings;

import java.util.Scanner;
import java.util.SortedMap;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("type a sentence");
        String sentence = s.nextLine().trim();

        System.out.println(sentence.substring(sentence.indexOf(" ")).trim() + " " + sentence.substring(0, sentence.indexOf(" ")));
    }}