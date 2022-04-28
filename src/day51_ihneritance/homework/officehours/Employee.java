package day51_ihneritance.homework.officehours;

public class Employee {
    /*
     Task  1 : EmployeeTask

         Create an Employee Class:

    			private variables:
    				name, gender, age, salary

    			Encapsulate all the private fields

    				1. Name can not be empty
    				2. gender can not anything other than female or male
    				3. age can not be less than 18
    				4. salary can not be zero or negative



     */
    private String name;
    private String gender ;
    private int age;
    private  double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty())
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        switch (gender){
            case "male":
            case"female":

        this.gender = gender;
    }}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      if(age>17){
        this.age = age;
    }}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0)
        this.salary = salary;
    }
}
