package day38_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {
        ArrayList<String>group=new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);
        group.add(0,"Victor");
        System.out.println(group);
        System.out.println(group.get(0));//Victor
        System.out.println(group.get(1));//Ziba
        group.add("Ozi");
        group.add(1,"James");
        System.out.println(group);
        System.out.println(group.add("Emre"));//will return tru because its a boolean return method
        System.out.println(group);

    }
}
