package day16_review;

import java.util.Scanner;

public class Browser {
        /*

                        Create  a program that accepts browserName and operatingSystem as String and isBrowserOpened as boolean
                            If the Browser is closed, try to open the corresponding browsers in that operating system to run your code.
                                    === These browsers can be opened in these operatingSystem ===
                                        chrome   		    --- > mac - windows
                                        chrome-headless 	--- > mac - windows
                                        firefox-headless    --- > mac - windows
                                        firefox             --- > mac - windows
                                        ie 					--- > windows
                                        edge 				--- > windows
                                        safari 			    --- > mac
                                        remote-chrome  		--- > mac - windows
                             - According to related browserName and operatingSystem it should give
                                 OUTPUT -- > "Browser is opened successfully with $browserName in $operatingSystem"
                              - if operatingSystem does not support $browserName
                                  OUTPUT -- > "Your $operatingSystem doesn't support $browserName"
                              - If the Browser is already opened it should give an error message
                                OUTPUT -- > "Browser is already opened with $browserName in $operatingSystem
                                        /EXAMPLES
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String browserName, operatorSystem;
            System.out.println("What is your operator system?");
            operatorSystem= input.nextLine();
            System.out.println("What is your browser name?");
            browserName= input.nextLine();
            System.out.println("Is the browser open");
            boolean isBrowserOpened= input.nextBoolean();
            String message ="Browser is opened successfully with ";

            if (isBrowserOpened) {
                message = ("The browser is already opened with " + browserName + " in " + operatorSystem);
            } else {
                switch (operatorSystem) {
                    case "mac":
                        switch (browserName) {
                            case "Chrome":
                            case "Chrome-headless":
                            case "Safari":
                            case "Firefox":
                            case "Firefox-headless":
                            case "remote-chrome":
                                message += (browserName + " in " + operatorSystem);
                                break;
                            default:
                                message = "Your " + operatorSystem + " doesnt support " + browserName + " browser";
                        }
                        break;
                    case "windows":
                        switch (browserName) {
                            case "Chrome":
                            case "Chrome-headless":
                            case "ie":
                            case "Firefox":
                            case "Firefox-headless":
                            case "edge":
                            case "remote-chrome":
                                message += (browserName + " in " + operatorSystem);
                                break;
                            default:
                                message = "Your " + operatorSystem + " doesnt support " + browserName + " browser";
                        }
                        break;

                    default:
                        message = ("Your " + operatorSystem + " doesnt support " + browserName + " browser");
                }
            }
            System.out.println(message);
        }
}
