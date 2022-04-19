package day38_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CoddingBat {
    public static int[] fix34(int[] nums) {
        int[] a = new int[nums.length];
        String indexOf3 = "";
        String indexOf4 = "";
        String other = "";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                indexOf3 += i + " ";
            } else if (nums[i] == 4) {
                indexOf4 += i + " ";
            } else
                other += nums[i] + " ";
        } if(indexOf3.isEmpty())return nums;
        String[] i3 = indexOf3.split(" ");
        int[] i3Integer = new int[i3.length];
        for (int i = 0; i < i3.length; i++) {
            i3Integer[i] = Integer.parseInt(i3[i]);
        }
        String[] i4 = indexOf4.split(" ");
        int[] i4Integer = new int[i4.length];
        for (int i = 0; i < i3.length; i++) {
            i4Integer[i] = Integer.parseInt(i4[i]);
        }
        for (int i = 0; i < i3Integer.length; i++) {
            a[i3Integer[i]] = 3;
            a[i3Integer[i] + 1] = 4;
        }
        String[] o = other.split(" ");
        int[] oth = new int[o.length];
        for (int i = 0; i < oth.length; i++) {
            oth[i] = Integer.parseInt(o[i]);}
        for (int i = 0,j=0; i < a.length; i++) {
            if(a[i]==0){
                a[i]=oth[j++];
            }
        }
        return a;

    }


//
//        }return[0];
//    }
    public static void main(String[] args) {
        int[] a = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        System.out.println(Arrays.toString(fix34(a)));

////    int sa=19;
////    String sum=sum.valueaOf(sa);
//
//    }
}}
