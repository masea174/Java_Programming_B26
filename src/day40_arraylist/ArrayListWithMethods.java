package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());
        ArrayList<String>days=getDaysOfWeek();
        System.out.println(days.get(0));
        System.out.println(getDaysOfWeek().get(0));

        System.out.println(printList(getDaysOfWeek()));
    }
    public static String printList(ArrayList<String> a){
        String str= "LIST: ";
        for (int i = 0; i < a.size(); i++) {
            str+="\n ~\t"+a.get(i);
        }
        return str;
    }
    public static ArrayList <String> getDaysOfWeek(){
       ArrayList <String> days=new ArrayList<>(Arrays.asList(
               "Monday",
               "Tuesday",
               "Wensday",
               "Thursday",
               "Friday",
               "Saturday",
               "Sunday"
       )) ;
       return days;
    }
}
