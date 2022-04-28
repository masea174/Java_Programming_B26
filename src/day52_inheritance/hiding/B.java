package day52_inheritance.hiding;

public class B extends A{
    @Override
    public void instanceMethodA() {
        staticMethod();
    }
 //   @Override    cant override static methods but we can declare the static method and the static method from the parent class will be called hidden
    public static void staticMethod(){
        System.out.println("Static method from the child class");
    }
}
