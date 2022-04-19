package day30_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String s="monday,tuesday,wendnesday,thursday,friday,saturday,sunday";
        String[] days=s.split(",");
        System.out.println(Arrays.toString(days));
        for(String each:days){
            System.out.println(each);
        }String []withoutDay=s.split("day");
        System.out.println(Arrays.toString(withoutDay));
        String str="Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[] months=str.split("-");
        for(String each:months){
            System.out.println(each);
        }
    }
}
