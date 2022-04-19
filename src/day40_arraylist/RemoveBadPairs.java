package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveBadPairs {
    /*
    Remove Bad Pairs
Create a method that will accept an Integer ArrayList and check for bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger then the
second number. Remove any bad pairs for the ArrayList and return the
ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of elements, so each number always has one pair
@param nums - Given ArrayList of numbers @return - ArrayList of numbers
     */
    public static ArrayList<Integer> badPair(ArrayList<Integer> nums){
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        for (int i = 0; i < nums.size(); i+=2) {
            if(nums.get(i)> nums.get(i+1)){
                a.add(nums.get(i));
                a.add(nums.get(i+1));
            }
        }
        for (int i = 0; i <a.size(); i++) {
            nums.remove(a.get(i));
        }
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(3,4,5,8,9,6,74,6,8,9));
        System.out.println(badPair(a));
    }
}
