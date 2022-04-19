package day38_arraylist;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("water");
        list.add("bread");
        list.add("wind");
        list.add("wood");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.remove(list.size()-1));//prints the removed element that was wood
        System.out.println(list);
        list .add("apples");
        list.remove(2);
        System.out.println(list);
        list.add("light");
        list.add("light");
        System.out.println(list);
        list.remove("light");
        System.out.println(list);
    }
}
