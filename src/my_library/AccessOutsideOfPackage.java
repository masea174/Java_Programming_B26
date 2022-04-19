package my_library;

import day47_encapsulation.AccessModiffier;

public class AccessOutsideOfPackage {

    //different class diferent package
    public static void main(String[] args) {
        AccessModiffier obj=new AccessModiffier();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);
        System.out.println(AccessModiffier.x);
//        System.out.println(AccessModiffier.y);

//        System.out.println(AccessModiffier.z);

        //c&z are private they can only be accesed in the same class
        //b and y default variables (didnt have any other access outside of the package)
}}
