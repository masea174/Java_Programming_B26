package day23_loops;

import java.util.Scanner;

public class Palindrome {
    /*
    means the same reading from the begining and end
    ex:mom;racecars;anna;madam
    check if a word is a palindrome or not

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str=input.nextLine();
        String newWord="";
        for(int i=str.length()-1;i>=0;i--){
            newWord+=(str.charAt(i));
        }if (newWord.equals(str)){
            System.out.println("the word "+str+" is palindrom");
        }else {
            System.out.println("the word "+str+" is not a palindrom");}
    }
}
