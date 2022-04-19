package day19_string;

import java.util.Scanner;

public class JamesLongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first String");
        String firstString = input.nextLine().trim();

        System.out.println("enter second String");
        String secondString = input.nextLine().trim();

        System.out.println("enter third String");
        String thirdString = input.nextLine().toLowerCase().trim();

        boolean firstA = firstString.contains("a");
        boolean secondA = secondString.contains("a");
        boolean thirdA = thirdString.contains("a");

        if (!firstA) {

            firstString = "";
        }

        if (!secondA) {

            secondString = "";

        }

        if (!thirdA) {

            thirdString = "";

        }

        int firstlen = firstString.length();
        int secondlen = secondString.length();
        int thirdlen = thirdString.length();

        boolean noPrint = false;

        if (firstA) {

            if (firstlen > secondlen && firstlen > thirdlen) {

                System.out.println("the first string is longest and contains A");
                noPrint = true;

            }

        }
        if (secondA) {

            if (secondlen > firstlen && secondlen > thirdlen) {

                System.out.println("the second ");
                noPrint = true;

            }

        }
        if (thirdA) {

            if (thirdlen > firstlen && thirdlen > secondlen) {

                System.out.println("the third String ");
                noPrint = true;

            }

        }

        if (!noPrint) {

            System.out.println("no single word with a is the longest");

        }
    }
}
