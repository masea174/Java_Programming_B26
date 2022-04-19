package day41_arraylist;

import my_library.StringUtil;

import java.util.ArrayList;

public class Reversal {
    public static ArrayList<String> reverseAll(ArrayList<String> list){
        ArrayList<String> reversedWords=new ArrayList<>();
        for (String each:list){
            reversedWords.add(StringUtil.reverseString(each));
        }return reversedWords;
    }
}
