package day30_arrays;

import java.util.Scanner;

public class Task1 {
    /*
    Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
______________________________________________
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your first name");
        String name=input.nextLine();
        char[] c=name.toCharArray();
        System.out.println(""+c[0]+c[c.length-1]);

    }

}

