package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class FriendList {
    /*
    make an array of your friends names
    asking how many friends you have
    than ask for each friends name ane at the time , store them into array
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("how many friends do you want o add?");
         int num=input.nextInt();
         input.nextLine();
         String []friends=new String[num];
        for (int i = 0; i < friends.length; i++) {
            System.out.println("introduce the name");
            friends[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(friends));
    }
}
