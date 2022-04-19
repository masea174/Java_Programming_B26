package day38_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

    ArrayList <String> group=new ArrayList<>();
        System.out.println(group.size());
        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Nali");
        System.out.println(group);
        System.out.println(group.size());
        System.out.println("first student "+group.get(0));
        System.out.println("second student "+group.get(1));
        System.out.println("third student "+group.get(2));
        System.out.println("fourth student "+group.get(3));
        System.out.println(" last student "+group.get(4));
        System.out.println();
        for (int i = 0; i < group.size(); i++) {
            System.out.println(i+1+ " student "+group.get(i));
        }
        System.out.println();
        for (String student:group){//student=group.get[i];
            System.out.println("Student "+student);
        }

}}
