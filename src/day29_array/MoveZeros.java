package day29_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] num={10,0,5,0,1};int a=0;
        int [] num2=new int[num.length];
        for (int each:num){
            if (each!=0){
                num2[a++]=each;
            }
        }
        System.out.println(Arrays.toString(num2));
    }
}
