package day33_methods;

import java.util.Scanner;

public class EligibleVote {
    public static void voteEligible(int age){
        System.out.println ((age>=18)? "Yes you are eligible to vote":"No you are not , must be 18 years old and up");

        }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        voteEligible(19);
        voteEligible(17);
        System.out.println("Please enter your age");
        voteEligible(input.nextInt());
    }}

