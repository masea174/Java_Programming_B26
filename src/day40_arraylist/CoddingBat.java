package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CoddingBat {
    public static boolean canBalance(int[] nums) {
        boolean isBalanced=false;
        for(int i=0;i<nums.length;i++){
            int[]first=new int[i];
            int []second=new int[nums.length-i];
            for (int j = 0; j < first.length; j++) {
                first[j]=nums[j];
            }for (int j = 0; j < second.length; j++) {
                second[j]=nums[i+j];}

            if(sum(first)==sum(second)){
                isBalanced=true;
            }
        }return isBalanced;


    }
    public static boolean linearIn(int[] outer, int[] inner) {

        ArrayList <Integer> outList=new ArrayList<>();
        ArrayList <Integer> inList=new ArrayList<>();
        for (int i = 0; i < outer.length; i++) {
            outList.add(outer[i]);
        }
        for (int i = 0; i < inner.length; i++) {
            inList.add(inner[i]);
        }
        outList.removeAll(inList);
        return inList.isEmpty();
    }
    public static int sum(int[] n){
        int sum=0;
        for(int i =0;i<n.length;i++){
            sum+=n[i];
        }return sum;
    }



    public static void main(String[] args) {
        int[]a={2, 1, 1, 2, 1};
        System.out.println(canBalance(a));
    }
}
