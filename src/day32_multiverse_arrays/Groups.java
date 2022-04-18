package day_32_multiverse_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String[][] cydeo=new String[4][];

        //at the moment there is 4 empty spots the need to be filled out with data
        System.out.println(Arrays.deepToString(cydeo));
        String []group1={"Erme","Yasir","Eda"};
        cydeo[0]=group1;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("adding the second group");
        String[]group2={"Barcsi","Demet","Ina","Ismail"};
        cydeo[1]=group2;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("adding 3rd group");
        cydeo [2]=new String[]{"mustafa","lima"};
        System.out.println("same group 3 as of group 4");
        cydeo[3]=cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println();

        for(String[] innerarray:cydeo){// loops thru the 2d array
            for( String  eachwor:innerarray){
                System.out.println(eachwor);//loop thru every single String element
            }
        }
    }
}
