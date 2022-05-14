package day53_abstract.homework;

public class Cheif extends Employee {
    /*
    reate a class Chef

inherits Employee class

implement hobby() and work() methods

    hobby(): Trying new food

    work(): Cooking a 3 course mea
     */

    @Override
    public void work() {
        System.out.println("Cooking a 3 course meal");
    }

    @Override
    public void hobby() {
        System.out.println("Trying new food");
    }
}
