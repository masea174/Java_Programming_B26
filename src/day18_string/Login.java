package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    /*
    Ask the user to enter the username make sure its lowercase
    ask the user to enter the pasword  check is the password is 8 caracted
    valid pass in the system "jamesbond"
    check if password matches the valid pass

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the login:" );
        String login=input.nextLine();
        login=login.toLowerCase();
        System.out.println(login);

        System.out.println("Please enter the password");
        String password = input.nextLine();
        int lenght = password.length();
        if (password.equals("jamesbond") && password.length() >= 8) {
            System.out.println("Logged in with "+login);

        } else {
            System.out.println("Wrong password");

        }

    }

}
