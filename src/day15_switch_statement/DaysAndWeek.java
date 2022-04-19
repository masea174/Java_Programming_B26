package day15_switch_statement;

import javax.naming.ldap.LdapContext;
import java.util.Scanner;

public class DaysAndWeek {
    /*
    giving a day number find and print day related to it
    t
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of day : ");
        int day= input.nextInt();
        String letterDay;

        switch (day) {
            case 1:
                letterDay = "Monday";
                break;
            case 2:
                letterDay = "Tuesday";
                break;
            case 3:
                letterDay = "Wensday";
                break;
            case 4:
                letterDay = "Thursday";
                break;
            case 5:
                letterDay = "Friday";
                break;
            case 6:
                letterDay = "Saturday";
                break;
            case 7:
                letterDay = "Sunday";
                break;
            default:
                letterDay = "No such a value";
                break;

        }
        System.out.println(letterDay);
    }
}
