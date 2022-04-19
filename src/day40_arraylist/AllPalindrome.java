package day40_arraylist;

import my_library.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    /*
    All Palindrome
Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity
Ex: Input:
"Anna", "Java", "Python", "Racecar", "Level", "Cydeo”, "Eye" Output:
Anna, Racecar, Level, Eye
     */
    public static ArrayList<String> allPalindrome(ArrayList<String> list){
        ArrayList<String>polidromeList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(StringUtil.reverseString(list.get(i)).toLowerCase().equals(list.get(i).toLowerCase())){
                polidromeList.add(list.get(i));
            }
        }return polidromeList;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(list));
    }
}
