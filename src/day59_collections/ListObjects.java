package day59_collections;

import day57_exeptions.webelement.Link;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();// using the refernce of the list because is implemented in the arrayList
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));

        List <String> list2=new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("c");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(3));

        List <String> list3=new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("c");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);
        System.out.println(list3.get(3));



    }
}
