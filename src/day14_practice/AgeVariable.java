package day14_practice;

public class AgeVariable {
    /*
    declare and assign an age variable
use these ranges to determine which age group you belong to
if the given age value is less than 0 or more than 120:
print: Invalid age
otherwise uses these to determine the age group
Baby (2 years and below)
Toddler (3 - 5)
Kid (6 - 9
Pre-Teen (10 - 12)
Teenager (13 - 17)
Young Adult (18 - 20)
Adult (21 - 35)
Middle-Aged Adult (36 - 55)
Senior Citizen (55+)
     */

    public static void main(String[] args) {

        int age =31;

        if (age>0 && age<120) {
            if (age <= 2) {
                System.out.println(age + " is a Baby");
            } else if (age <= 5) {
                System.out.println(age + "ia a toddler");
            } else if (age <= 9) {
                System.out.println(age + "-kid");
            } else if (age <= 12) {
                System.out.println(age + "-pre-teen");
            } else if (age <= 17) {
                System.out.println(age + "-teenager");
            } else if (age <= 20) {
                System.out.println(age + "-young adult");
            } else if (age <= 35) {
                System.out.println(age + "-adult");
            } else if (age <= 55) {
                System.out.println(age + "-middle-aged adult");
            } else {
                System.out.println(age + " -senior citizen");
            }

        } else{
            System.out.println("Invalid age");
        }

    }  }
