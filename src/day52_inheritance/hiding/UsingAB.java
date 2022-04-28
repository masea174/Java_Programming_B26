package day52_inheritance.hiding;

public class UsingAB {
    public static void main(String[] args) {

        A.staticMethod();
        B.staticMethod();
        A a=new A();
        a.instanceMethodA();
        B b=new B();
        b.instanceMethodA();
    }
}
