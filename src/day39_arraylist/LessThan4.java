package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LessThan4 {
    /*
    Four or less
Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList. Print that ArrayList of words
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut” Output:
[ tree, loop, cat ]

     */
    public static void main(String[] args) {
        ArrayList <String> list =new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> shorties=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()<5){
                shorties.add(list.get(i));
            }
        }
        System.out.println(shorties);
    }
}
