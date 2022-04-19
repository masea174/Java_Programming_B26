package day43_constroctors;

public class Employee {
    /*
    reate a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            - create a constructor that creates an Employee object with the name and job title

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects
     */
    String name;
    int id;
    String jobTitle;
    double salary;
    public Employee(String name,String jobTitle){
        this.name=name;
        this.jobTitle=jobTitle;
    }
    public Employee(String name,int id,String jobTitle,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.id=id;
        this.salary=salary;
    }
    public void goToMeeting(){
        System.out.println(name+" is going to the meeting.");
    }
    public String toString(){
        String mess=name +" holds "+jobTitle+" as a job ";
        if(id>0){
            mess+=" the employee id is "+id;
        }
        if (salary>0){
            mess+=" and the salary is: $"+salary;
        }return mess;
    }
}
