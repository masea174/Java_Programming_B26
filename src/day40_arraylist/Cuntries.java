package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Cuntries {
    /*
    Remove Countries
Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
@param nums - The given ArrayList of numbers @return - ArrayList of numbers
Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */
    public static ArrayList<String> removeCountries (ArrayList<String> list){
        list.removeIf(country->country.length()>7);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(removeCountries(list));
    }
}
