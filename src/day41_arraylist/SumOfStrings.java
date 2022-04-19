package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfStrings {
    public static ArrayList<Integer> sumFromString(ArrayList<String >list){
        ArrayList<Integer> sums=new ArrayList<>();
        for (String each:list){
            int curentSum=0;
            for(String eachDigit:each.split("")){//I am converting the string each to an array by splitting with empyy space .it meanse that each character will be converted as separate elements of an array
                curentSum+=Integer.parseInt(eachDigit);
            }sums.add(curentSum);
        }return sums;
    }

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>(Arrays.asList("12","34","234"));
        System.out.println(sumFromString(list));
    }
}
