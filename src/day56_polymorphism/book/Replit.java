package day56_polymorphism.book;

import java.util.ArrayList;

public class Replit {
    public static void main(String[] args) {


    int[] nums = {1,2,3,4,5,4,2,3,1,0,1};
    int result=0;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums [i]==nums[j]){
                count++;
            }
        }if(count==1){
            list.add(nums[i]);
            result=nums[i];
        }}
            System.out.println(list);
        System.out.println(result);

}
}

