package day44_costum_classes;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void goToMeeting(){
        System.out.println(name+" is going to the meeting ");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name  +
                ", id=" + id +
                ", jobTitle='" + jobTitle  +
                ", salary=" + salary +
                '}';
    }
}
