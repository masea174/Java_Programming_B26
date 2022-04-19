package day47_encapsulation;

public class AccessModiffier {
    public int a;
    int b;
    private int c;

    public static int x;
    static int y;
    private static int z;

    public static void main(String[] args) {
        AccessModiffier obj=new AccessModiffier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(AccessModiffier.x);
        System.out.println(AccessModiffier.y);
        System.out.println(AccessModiffier.z);
        // we can acces every thing in the same class
    }

}
