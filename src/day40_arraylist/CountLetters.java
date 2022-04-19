package day40_arraylist;

import my_library.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    /*
    Count Letters
Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex: Input:
Output: 6
”java”, ”html”, “css”, “java”, “javascript”, “selenium” letter: ‘a’
     */
    public static int countLetters(ArrayList<String> list,char a){
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            count+=StringUtil.frequencyOfCharacter(list.get(i),a);
        }

    return count;}

    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countLetters(s,'a'));
    }
}
