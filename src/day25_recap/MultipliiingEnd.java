package day25_recap;

import java.util.Scanner;

public class MultipliiingEnd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("insert the word");
        String word=s.next();
        System.out.println("insert a number");
        int a=s.nextInt();

        for (int i = 0; i < a; i++) {
            word+=word.charAt(word.length()-1);
        }
        System.out.println(word);
    }
}
