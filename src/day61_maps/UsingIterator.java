package day61_maps;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {


    ArrayList<String> names=new ArrayList<>(Arrays.asList("james","emre","bruce"));
        System.out.println(names);
    Iterator<String> it=names.iterator();
        System.out.println(it.next());//moves the pin and returns the element
        System.out.println(it.next());
        //moves the pin and returns the element

        System.out.println(it.next());//moves the pin and returns the element
       // System.out.println(it.next()); , no element so it with throw A exceeption

}}
