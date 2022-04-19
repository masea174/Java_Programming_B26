package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDublicats {
    /*
    Remove Duplicates
Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers @return - ArrayList of numbers
Ex:
Input: {1, 3, 5, 1, 4, 5, 9}; Output: {3, 4, 9};
     */
    public static ArrayList<Integer> removeDublicates(ArrayList<Integer> nums) {
        ArrayList<Integer>a=new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (Collections.frequency(nums, nums.get(i)) > 1) {
                a.add(nums.get(i));
            }
        }nums.removeAll(a);
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDublicates(a));
    }
}