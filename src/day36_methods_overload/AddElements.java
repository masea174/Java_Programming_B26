package day36_methods_overload;

import java.util.Arrays;

public class AddElements {
    public static int[] addElement(int[] origina, int elenentToAdd) {
        int[] newArray = new int[origina.length + 1];
        for (int i = 0; i < origina.length; i++) {
            newArray[i] = origina[i];
        }
        newArray[newArray.length - 1] = elenentToAdd;
        return newArray;
    }

    public static String[] addElement(String[] origina, String elenentToAdd) {
        String[] newArray = new String[origina.length + 1];
        for (int i = 0; i < origina.length; i++) {
            newArray[i] = origina[i];
        }
        newArray[newArray.length - 1] = elenentToAdd;
        return newArray;
    }

    public static int[] addElement(int[] origina, int[] elenentToAdd) {
        int[] newArray = new int[origina.length + elenentToAdd.length];
         for (int i = 0,j=0; i < origina.length; i++) {
             newArray[i]=origina[i];
         }
         for (int i = origina.length,j=0; i < newArray.length; i++) {
             newArray[i]=elenentToAdd[j++];
         }
//         //USING ONLY ONE LOOP WITH A IF CONDITIN

//
//        for (int i = 0, j = 0; i < newArray.length; i++) {
//            if (i < origina.length) {
//                newArray[i] = origina[i];
//            } else {
//                newArray[i] = elenentToAdd[j++];
//            }
//
//        }
            return newArray;

    }


    public static void main(String[] args) {
        int[] y = {5, 34, 56, 7, 9};
        int[] z = {3, 23, 6};
        System.out.println(Arrays.toString(addElement(y, z)));
    }
}

