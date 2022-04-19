package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductLog {
   /* Target word
    Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
    Ex: Input:
    Target: java Output:
            2
            ”java”, ”html”, “css”, “java”, “javascript”, “selenium”*/
   public static void main(String[] args) {
       ArrayList <String> list=new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
       String target="java";
       int count =0;
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).equals(target)){
               count++;
           }
       }
       System.out.println(count);
   }
}
