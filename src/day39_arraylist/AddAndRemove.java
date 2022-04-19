package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAndRemove {
    public static void main(String[] args) {


    ArrayList<String> list=new ArrayList<>();
    list.add("computer");
    list.add("screen");
    list.add("mouse");
    list.add("keyboard");

    String item=list.remove(0);
        System.out.println(item);
        list.remove("mouse");
        System.out.println(list);
}}
