package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Hide Password
Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, **** ]
     */
    public static void main(String[] args) {
        ArrayList<String> password=new ArrayList<>(Arrays.asList("one", "hi", "hold"));

        for (int i = 0; i < password.size(); i++) {
            String var="";
            var ="*".repeat(password.get(i).length());
            password.set(i, var);
        }
        System.out.println(password);
    }
}
