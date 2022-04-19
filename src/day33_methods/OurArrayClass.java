package day33_methods;

import java.util.Arrays;

public class OurArrayClass {
    /*
    all will accept array arg int
    create a method that will print the first element
    last element

    middle elements

     */
    public static void firstElement(int[]nums){
        System.out.println("First element: "+nums[0]);
    }
    public static void lastElement (int[]nums){
        System.out.println("Last element: "+ nums[nums.length-1]);
    }
    public static void middleElement(int[]nums){
        if(nums.length%2==0){
            System.out.println("Middle elements are: "+ nums[nums.length/2-1]+" and "+nums[nums.length/2]);
        }else System.out.println("Middle element is: "+nums[nums.length/2]);
    }
    public static void printArray(int[]nums) {
        String result = "Start| ";
        for (int num : nums){
            result+=num+ ", ";

        }result=result.substring(0,result.length()-2);
        result+=" |End";
        System.out.println(result);
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,0,5,6};
       firstElement(a);
        lastElement(a);
        middleElement(a);
        printArray(a);
        printArray(new int []{20,10,30});
        System.out.println(Arrays.toString(a));



}}
