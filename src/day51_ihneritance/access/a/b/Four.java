package day51_ihneritance.access.a.b;

import day51_ihneritance.access.a.First;

public class Four extends First {
    // inheriting from a diferent class
    //diferent class different package
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
//        System.out.println(obj.three);
//        System.out.println(obj.two);
//        System.out.println(obj.four);
        Four obj2=new Four();
        System.out.println(obj2.one);
        System.out.println(obj2.two);
    }
    // protected you can inherit it to a new class but you will not be able to dirrect access it in a diferent class. lane 12
    //the Object First Parent object will not be able to have outside of the original package the protected variable but it can pass it to the new class, so the object Four now have access to the protected variable lane 16
}
