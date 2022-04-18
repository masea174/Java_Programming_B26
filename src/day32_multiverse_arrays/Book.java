package day_32_multiverse_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        /*
        how many chapters are there
        make a book with that many chapters
        ask the user to write the chapters one at the time
        by each chapter by the sentence break
         */
        Scanner input =new Scanner(System.in);
        System.out.println("how many chapters are going to be");
        String [][] book=new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();

        for(int i=0;i<book.length;i++){
            System.out.println("enter chapter "+(i+1));
            String chapter=input.nextLine();
            String[]sentences=chapter.split("\\.");// breaking up by dot
            book[i]=sentences;

        }
        System.out.println(Arrays.deepToString(book));
    }
}
