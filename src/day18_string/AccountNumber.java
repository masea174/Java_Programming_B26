package day18_string;

import java.util.Scanner;

public class AccountNumber {
    /*
    create a class AccountNumber
ask the user enter an account number and check if the account number is valid. Accounts are valid if:
handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the account number:");
        String num = input.nextLine();
        num = num.trim();

        if (num.isEmpty()) {
            System.out.println("Empty imput given");
        } else {
            if (num.startsWith("2")) {
                if (num.length() == 7) {
                    System.out.println("valid 7-digit account");
                } else if (num.length() != 7) {
                    System.out.println("Invalid 7-digit account");
                }else
                    System.out.println("invalid account number");
            }
            if (num.startsWith("5")) {
                if (num.length() == 10) {
                    System.out.println("Valid 10-digit account");
                } else if(num.length()!=10)
                    System.out.println("Invalid 10-digit account");
                }else {if (!num.startsWith("2"))
                System.out.println("Invalid account number");
            }
            }
        }
    }
