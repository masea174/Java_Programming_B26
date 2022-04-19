package day37_wrappers_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMethods {
//    public String deFront(String str) {
//        if (str.charAt(0) != 'a') {
//            if (str.charAt(1) != 'b') {
//                return str.substring(2);
//            } else {
//                return "b" + str.substring(2);
//            }
//        } else {
//            if (str.charAt(1) != 'b') {
//                return "a" + str.substring(2);
//            } else {
//                return "ab" + str.substring(2);
//            }
//        }
//    }
//}
//public String withoutX2(String str) {
//    if(str.charAt(0)=='x'&&str.charAt(1)=='x'){
//        return str.substring(2);
//
//    }if(str.charAt(0)=='x'){
//        if(str.charAt(1)=='x'&&str.length()>2){
//            return str.substring(2);}
//        else
//            return str.substring (1);}
//
//
//  return str;
//}}
//public static int[] reverse3(int[] nums) {
//    int [] reverse=new int[3];
//    for(int i=0;i<nums.length;i++){
//        reverse[i]=nums[nums.length-i-1];
//    }
//    return reverse;
//}
//
//    public static void main(String[] args) {
//    int[]a={5,7,9};
//        System.out.println(Arrays.toString(reverse3(a)));
//    }
//}
//public int maxTriple(int[] nums) {
//    int biggest=int[O];
//    if(biggest <nums[nums.length/2]){
//        biggest=nums[nums.length/2];
//    }if(biggest<nums[nums.length-1]){
//        biggest=nums[nums.length-1];
//    }
//    return biggest;
//}
public int caughtSpeeding(int speed, boolean isBirthday) {
    int i = 0;
    if ((speed >= 60 && speed <= 80) || (isBirthday && speed >= 65 && speed <=86)){
        i = 1;
    }else if (speed > 81 || isBirthday && speed > 86) {
        i = 2;
    } else {
        i = 0;
    }
    return i;
}

}



