package day44_costum_classes;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee("James","Secret agent");
        System.out.println(employee1);

        Employee employee2=new Employee("Eman",25,"SDET",100000);
        System.out.println(employee2);
        employee1.goToMeeting();
        employee2.goToMeeting();
    }
}
