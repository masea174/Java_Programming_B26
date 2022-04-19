package day39_arraylist;

import java.util.ArrayList;

public class UpperCaseLowerCase {
    /*
    Get Uppercase or Lowercase
Write a program that can extract the uppercase and lowercase characters from a String and store them into separate ArrayLists of Characters
Ex:
str = “heLLoWoRlD list1: {h, e, o, o, l} list2: {L, L, W, R, D}
     */
    public static void main(String[] args) {
        String str="heLLoWoRlD";
        ArrayList<Character>upper=new ArrayList<>();
        ArrayList<Character>lower=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char letter=str.charAt(i);
            if(Character.isUpperCase(letter)){
                upper.add(letter);
            }else if(Character.isLowerCase(letter)){
                lower.add(letter);
            }
        }
        System.out.println(lower);
        System.out.println(upper);
    }
}
