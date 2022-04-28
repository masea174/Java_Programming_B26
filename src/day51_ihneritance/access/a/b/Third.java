package day51_ihneritance.access.a.b;

import day51_ihneritance.access.a.First;

public class Third {

    //diferent class diferent package
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
//        System.out.println(obj.three);
//        System.out.println(obj.two);
//        System.out.println(obj.four);
    }// four is visible in only in the same class
    //three is default no access in the diferent packege
    //two is acceseble only if its inherited in a diferent package other way it will behave like a default variable
}
