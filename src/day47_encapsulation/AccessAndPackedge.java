package day47_encapsulation;

public class AccessAndPackedge {
    public static void main(String[] args) {

        //diferernt class same package,
        AccessModiffier obj=new AccessModiffier();
        System.out.println(obj.a);
        System.out.println(obj.b);
     //   System.out.println(obj.c);
        System.out.println(AccessModiffier.x);
        System.out.println(AccessModiffier.y);
      //  System.out.println(AccessModiffier.z);
        //c and z were not accesible autside of the class because they were private

}}
