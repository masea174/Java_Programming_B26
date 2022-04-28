package day51_ihneritance.homework.seasons;

import day50_inheritance.computer.Windows;

public class CheckSeasons {

    public static void main(String[] args) {
        Winter obj=new Winter(10,-20);
        System.out.println(obj);
        obj.activity();

        Spring obj1=new Spring(28,-10);
        System.out.println(obj1);
        obj1.activity();

        Fall obj2=new Fall(30,-10);
        System.out.println(obj2);
        obj2.activity();

        Summer obj3=new Summer(40,15);
        System.out.println(obj3);
        obj3.activity();
    }
}
