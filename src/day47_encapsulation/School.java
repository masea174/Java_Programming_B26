package day47_encapsulation;

import day46_static.CydeoStudent;

public class School {
    public static void main(String[] args) {
        CydeoStudent Emre=new CydeoStudent("Emre",5);
        CydeoStudent.printInfo();

        System.out.println();
        Emre.printInfo();
        System.out.println();
        System.out.println(CydeoStudent.instroctors[0]);

        for (String each:CydeoStudent.instroctors){
            System.out.println(each);
        }
    }
}
