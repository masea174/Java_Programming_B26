package day_34_return_methods;

import java.util.Scanner;

public class NumberAsWords {
    public static String numberAsWord(int num){
        if(num<0||num>10){
            return num+ " is invalid number";
        }
        String[]words={"one","two","three","four","five","six","seven","eighth","nine","ten"};
       return words[num-1];

    }

    public static void main(String[] args) {
        System.out.println(numberAsWord(7));
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number you are interested");
        System.out.println(numberAsWord(input.nextInt()));

    }
}
