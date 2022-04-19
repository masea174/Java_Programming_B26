package day18_string;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UserAndPass {
    /*
    create a class UserAndPass
ask the user to enter a username and password. Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the username
	If the password has the username in it print: "Invalid password, username should not be in it" and in that case change the password to have the value: "password"

Print the information in the end

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the username:");
        String user= input.next();
        System.out.println("enter the pasword:");
        String pass= input.next();

        if (pass.length()<5){
            System.out.println("the password cant be less than 5 characters");
        }else {
            if (pass.contains(user)){
                System.out.println("invalid password,username should not be in it,default password is set up:");
                pass="password";
            }else  {
                System.out.println("valid password for user: "+user);
            }
        }
    }
}
