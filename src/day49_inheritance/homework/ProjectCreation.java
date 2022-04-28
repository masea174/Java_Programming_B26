package day49_inheritance.homework;

public class ProjectCreation {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Diana";
        employee.isFullTime=true;
        employee.salary=100000;
employee.work();
        System.out.println();
        Tester tester=new Tester();
        tester.name="Diana Bu" ;
        tester.isFullTime=true;
        tester.salary=120000;
        tester.test();
        tester.bugsFound=true;
        tester.work();
        System.out.println();

        Developer developer=new Developer();
        developer.name="Bulgac";
        developer.isFullTime=true;
        developer.salary=150000;
        developer.develop();
        developer.feauturesCreated=true;
    }
}
