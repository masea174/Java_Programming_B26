package day58_exeptions;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList <String> list =new ArrayList<>();
        list.add("Hello");
        list.add("bye");
        try{
            String s=null;

            System.out.println(list.get(1));
            s.toLowerCase();

        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }catch (NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }
        System.out.println(list);

        try {
            Thread.sleep(-3000);
        }catch (IllegalArgumentException e){
            System.out.println("Wrong numbers ");

            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            System.out.println("Time is up");
        }finally{
            System.out.println("Last line of the sleep try");
        }
    }
}
