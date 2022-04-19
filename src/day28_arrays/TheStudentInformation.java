package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TheStudentInformation {
    public static void main(String[] args) {
        /*
        have an array that holds multiple inform about student
        0- id#
        1 -name
        2 -last name
        3 -batch number
         */
        String[] student = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(student));
        String[] student2 = new String[4];
        System.out.println(Arrays.toString(student2));
        student2[0] = "010";
        student2[1] = "Joe";
        student2[2] = "Biden";
        student2[3] = "2022";
        System.out.println(Arrays.toString(student2));


        String[] student3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("enter your id");
    student3[0]=input.nextLine();
        System.out.println("enter your name");
        student3[1]=input.nextLine();
        System.out.println("enter your last name");
        student3[2]=input.nextLine();
        System.out.println("enter your batch number");
        student3[3]=input.nextLine();
        System.out.println(Arrays.toString(student3));

        String []student4=new String[4];
        String[] question={"enter your ID","Enter your first name","Enter your last name","whats your batch"};
        for (int i = 0; i < 4; i++) {
            System.out.println(question[i]);
            student4[i]=input.nextLine();
        }
        System.out.println(Arrays.toString(student4));
    }
}
