package day53_abstract.homework;

public abstract class Employee extends Person {
    /*
    Create a class Employee

make this class abstract

inherits Person class

define variables:
    job title, salary

define abstract method:
    work()

override the toString method
     */
    String jobTitle;
    double salary;

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
