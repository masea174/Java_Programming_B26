package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
       0- full name
       1- account type
       2-account number
       3 -balance
         */
        String [] info={"Brad Smith","Checking","10098378383","100_000_000"};
        System.out.println(info.length);
        System.out.println(Arrays.toString(info));
        System.out.println("Name :"+info[0]);
        System.out.println(("Account type: "+info[1]));
        System.out.println("Account number: "+info[2]);
        System.out.println("Balance: "+info[3]);

        String [] info2=new String[4];
        System.out.println(Arrays.toString(info2));
        info2[0]="Jamie Fox";
        info2[1]="Savings";
        info2[2]="27328746284";
        info2[3]="100";
        System.out.println(Arrays.toString(info2));

        String [] info3=new String[4];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the full name");
        info3[0]=input.nextLine();
        System.out.println("Enter the bank acount type");
        info3[1]=input.nextLine();
        System.out.println("Enter the Account number");
        info3[2]=input.nextLine();
        System.out.println("enter the balance");
        info3[3]=input.nextLine();
        System.out.println(Arrays.toString(info3));

        String []info4=new String[4];
        for (int i = 0; i < info4.length; i++) {
            String[]questions={" full name","bank account type","account number","Enter balance"};
            System.out.println("Enter your "+questions[i]);
            info4[i]= input.nextLine();

        }
        System.out.println(Arrays.toString(info4));
    }
}
