package day40_arraylist;

import my_library.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    /*

   Reverse All
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings @return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"} Output: {"det", "klat", "nrael"}
     */
    public static ArrayList<String> reverseEachElement(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.add(i, StringUtil.reverseString(list.remove(i)));
        }return list;
    }

    public static void main(String[] args) {
ArrayList <String> list=new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseEachElement(list));
    }
}
