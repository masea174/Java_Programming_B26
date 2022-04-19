package day39_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums.indexOf(100));
        System.out.println(nums.indexOf(700));//-1
        System.out.println(nums.lastIndexOf(100));

    }
}
