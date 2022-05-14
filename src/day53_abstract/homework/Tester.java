package day53_abstract.homework;

public class Tester extends Employee{
    /*
    Create a class Tester

inherits Employee class

implement hobby() and work() methods

    hobby(): create a print statement for your own hobbies

    work(): Running test cases
     */

    @Override
    public void work() {
        System.out.println("Running the test");
    }

    @Override
    public void hobby() {
        System.out.println("Love programming java");
    }
}
