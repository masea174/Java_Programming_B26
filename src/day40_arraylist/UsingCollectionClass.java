package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UsingCollectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(3,6,2,67,22,230,12));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters=new ArrayList<>(Arrays.asList('A','E','B','C','D'));
        Collections.reverse(letters);
        System.out.println(letters);
        Collections.sort(letters);
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(letters,0,3);
        System.out.println(letters);

        ArrayList <Integer> numbers=new ArrayList<>(Arrays.asList(11,11,20,11,20,20));
        System.out.println(Collections.frequency(numbers,11));
    }
}
