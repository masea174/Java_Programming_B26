package day44_costum_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayEmployee {
    /*
    Make a class for Employee objects (from class)

    try to make an ArrayList of Employee objects
    maintain the list to have all the Employees that are SDET or Developer
    maintain a separate list of all the Employees who make over 100,000 salary
    find the max salary from the Employees
     */
    public static void main(String[] args) {

        Employee employee = new Employee("Diana ", "SDET");
        Employee employee1 = new Employee("Bond", "Developer");
        Employee employee2 = new Employee("Stark", 6372, "supehero", 98273);
        Employee employee3 = new Employee("Steve", 6787, "maintanace", 198999);
        Employee employee4 = new Employee("Robert", 1287, "Developer", 126733);

        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(employee, employee1, employee4, employee3, employee2));
        ArrayList<Employee>list2=new ArrayList<>(list);
        double maxSalary=list.get(0).salary;
        for(Employee each:list){
            if(each.salary>maxSalary){
                maxSalary= each.salary;
            }
        }
        System.out.println(maxSalary);

        System.out.println(list);
            list.removeIf(each->!(each.jobTitle.equals("SDET")||each.jobTitle.equals("Developer")));
            list2.removeIf(each->each.salary<100000);
        System.out.println(list);
        System.out.println();
        System.out.println(list2);
    }




}
