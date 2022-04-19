package day43_constroctors;

public class UseEmployee {
    public static void main(String[] args) {
        Employee emp1=new Employee("Diana","SDET");
        System.out.println(emp1);
        emp1.goToMeeting();
        Employee emp2=new Employee("Robert",6743876,"POL adviser",110000.00);
        emp2.goToMeeting();
        System.out.println(emp2);
    }
}
