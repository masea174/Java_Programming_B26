package day19_string;

import java.util.Scanner;

public class DoublePrintBeggining {

        public static void main(String[] args) {
            //DO NOT TOUCH BELOW
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            //WRITE YOUR CODE HERE
            int i = word.length() / 2 - 1;
            System.out.println(i);
            System.out.println(word.substring(0, i) + word.substring(0, i));


        }
        }
