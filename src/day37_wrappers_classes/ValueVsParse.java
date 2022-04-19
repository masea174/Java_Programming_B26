package day37_wrappers_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueVsParse {
    public static void main(String[] args) {


    String s="30";
    int seconds=Integer.parseInt(s);

    Integer i= Integer.valueOf(s);//converst the 30 string into integer wrapper class object;
        int i2=Integer.valueOf(s);//unboxing frpm Integer class to primitive type

        String b=String.valueOf(30);
        b+=5;//305 concatinating cause the 30 turned in String in lane 13

        ArrayList<String> list =new ArrayList<>(Arrays.asList("one","two"));
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.get(0)+list.remove("two"));
 }}

