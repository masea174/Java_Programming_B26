package day53_abstract.homework;

public abstract class Person {
    /*
    Create a class Person

make this class abstract

define variables:
    name, age

define abstract method:
    hobby()
     */
    String name;
    int age;
    public abstract void hobby();

    @Override
    public abstract String toString() ;

}
