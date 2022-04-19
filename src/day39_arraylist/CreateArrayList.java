package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> listOne=new ArrayList<>(Arrays.asList("hello","buy"));
        System.out.println(listOne);
        ArrayList <String> listTwo=new ArrayList<>(listOne);
        listTwo.add("Hola");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listTree=new ArrayList<>(Arrays.asList("one","Two","Three"));
        System.out.println(listTree);

       // ArrayList<String >listFour=new ArrayList<>("four","five","six"); not a valid sintax

    }
}
