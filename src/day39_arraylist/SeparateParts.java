package day39_arraylist;

import java.util.ArrayList;

public class SeparateParts {
    /*
    Separate Parts
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
Ex:
str = "ABCD123$%#@&456EFG!" list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6
     */
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";
        ArrayList<Character>upper=new ArrayList<>();
        ArrayList<Character>lower=new ArrayList<>();
        ArrayList<Character>special=new ArrayList<>();
        ArrayList<Character>digits=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char letter=str.charAt(i);
            if(Character.isUpperCase(letter)){
                upper.add(letter);
            }else if(Character.isLowerCase(letter)){
                lower.add(letter);
            }else if(Character.isDigit(letter)){
                digits.add(letter);
            }else{
                special.add(letter);
            }
        }
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(digits);
        System.out.println(special);
    }
}
